/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package mythread.deadlock;



public class DeadLockTest {
  public static void main(String args[]){
     Operator o1=new Operator();
     Operator o2=new Operator();

     o1.anotherOperator=o2;
     o2.anotherOperator=o1;

     Thread t1=new Thread(o1);
     Thread t2=new Thread(o2);
     t1.start();
     t2.start();
  }
}

class Operator implements Runnable{
  Operator anotherOperator;

  synchronized public void methodA(){
    System.out.println(Thread.currentThread().getName()+":begin methodA");
    try{Thread.sleep(200);}catch(Exception e){}
    System.out.println(Thread.currentThread().getName()+":call another methodA");
    anotherOperator.methodA();
    System.out.println(Thread.currentThread().getName()+":end methodA");
  }

  public void run(){
     methodA();
  }
}
