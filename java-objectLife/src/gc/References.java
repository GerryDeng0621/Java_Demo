package gc;
import java.lang.ref.*;
import java.util.*;

class Grocery{
  private static final int SIZE = 10000;
  //属性d使得每个Grocery对象占用较大内存空间，有80KB左右
  private double[] d = new double[SIZE];  
  private String id;
  public Grocery(String id) { this.id = id; }
  public String toString() { return id; }
  public void finalize() {
    System.out.println("Finalizing " + id);
  }
}

public class References {
	//
  private static ReferenceQueue<Grocery> rq = new ReferenceQueue<Grocery>();
  public static void checkQueue() {
//    Reference<? extends Grocery> inq = rq.poll();  //从队列中取出一个引用
//    if(inq != null)
//      System.out.println("In queue: "+inq+" : "+inq.get());
	//从队列中取出一个引用，若没有引用则为null. 
    Reference<? extends Grocery> inq = rq.poll();  
    //因为虚引用只是用来跟踪gc的行迹，猜所以当看到requenceQueue队列里没有虚引用表示gc没有工作。
    while (inq != null)
      {System.out.println("In queue: "+inq+" : "+inq.get());
      inq = rq.poll();
      }
  }

  public static void main(String[] args) {
    final int size=10;

    //创建10个Grocery对象及10个虚引用
    Set<PhantomReference<Grocery>> pa = new HashSet<PhantomReference<Grocery>>();
    for(int i = 0; i < size; i++) {
      PhantomReference<Grocery>ref = 
             new PhantomReference<Grocery>(new Grocery("Phantom " + i), rq);
      //测试得出just created:null,虚引用的get方法返回都是null
      System.out.println("Just created: " +ref.get());
      pa.add(ref);
    }
    System.gc();
    checkQueue();

    //创建10个Grocery对象及10个软引用
    Set<SoftReference<Grocery>> sa = new HashSet<SoftReference<Grocery>>();
    for(int i = 0; i < size; i++) {
    	//当该引用的对象被释放后，则该引用放入referenceQueue里
      SoftReference<Grocery> ref=
               new SoftReference<Grocery>(new Grocery("Soft " + i), rq);
      //返回参考对象，如果被回收了(垃圾回收或程序清除)，则返回0
      System.out.println("Just created: " +ref.get());
      sa.add(ref);
    }
    System.gc();
    checkQueue();

    //创建10个Grocery对象以及10个弱引用
    Set<WeakReference<Grocery>> wa = new HashSet<WeakReference<Grocery>>();
    for(int i = 0; i < size; i++) {
       WeakReference<Grocery> ref=
          new WeakReference<Grocery>(new Grocery("Weak " + i), rq);
      System.out.println("Just created: " +ref.get());
      wa.add(ref); 
    }
    System.gc();
    checkQueue();
}
}


/****************************************************
 * 作者：孙卫琴                                     *
 * 来源：<<Java面向对象编程>>                       *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
