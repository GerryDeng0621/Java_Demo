package reference;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class Demo {
public static void main(String[] args) {
//	String str=new String("hello");
//	ReferenceQueue<String>rq=new ReferenceQueue<String>();
//	WeakReference<String> wf = new WeakReference<String>(str, rq); //��
//	str=null; //��ȡ��"hello"�����ǿ����
//	String str1=wf.get(); //�ݼ���"hello"����û�б����գ�str1����"hello"����
//	//����"hello"����û�б����գ�rq.poll()����null
//	Reference<? extends String> ref=rq.poll(); //��
	
    Object o = new Object();
    // Ĭ�ϵĹ��캯������ʹ��ReferenceQueue.NULL ��Ϊqueue
    WeakReference<Object> wr = new WeakReference<Object>(o);
    System.out.println(wr.get() == null);
    o = null;
    System.gc();
    System.out.println(wr.get() == null);
}
}

