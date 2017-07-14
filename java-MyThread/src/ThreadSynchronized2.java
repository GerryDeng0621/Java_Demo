
public class ThreadSynchronized2  implements Runnable{
	private int a=1;
	@Override
	public void run() {
		for(int i=0;i<1000;i++)
		{method1(i);
		}
	}
	 
	public synchronized void method1(int i)
	{a=a+i;
	Thread.yield();
	a=a-i;
	System.out.println(a);
		
	}
public static void main(String[] args) {
	ThreadSynchronized2 ts=new ThreadSynchronized2();
	Thread t1=new Thread(ts);
	Thread t2=new Thread(ts);
	t1.start();
	t2.start();
}
}
