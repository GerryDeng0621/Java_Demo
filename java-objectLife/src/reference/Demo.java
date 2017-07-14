package reference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class Demo {
public static void main(String[] args) {
//	String str=new String("hello");
//	ReferenceQueue<String>rq=new ReferenceQueue<String>();
//	WeakReference<String> wf = new WeakReference<String>(str, rq); //③
//	str=null; //④取消"hello"对象的强引用
//	String str1=wf.get(); //⑤假如"hello"对象没有被回收，str1引用"hello"对象
//	//假如"hello"对象没有被回收，rq.poll()返回null
//	Reference<? extends String> ref=rq.poll(); //⑥
	
    Object o = new Object();
    // 默认的构造函数，会使用ReferenceQueue.NULL 作为queue
    WeakReference<Object> wr = new WeakReference<Object>(o);
    System.out.println(wr.get() == null);
    o = null;
    System.gc();
    System.out.println(wr.get() == null);
}
}

