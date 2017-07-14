
public class ThreadSynchronized3  implements Runnable{
	private int a=1;
	@Override
	public void run() {
		for(int i=0;i<1000;i++)
		{
			synchronized(this){a=a+i;
		Thread.yield();
		a=a-i;
		System.out.println(a);
		}}
	}
	 
	
public static void main(String[] args) {
	ThreadSynchronized3 ts=new ThreadSynchronized3();
	Thread t1=new Thread(ts);
	Thread t2=new Thread(ts);
	t1.start();
	t2.start();
}
}
