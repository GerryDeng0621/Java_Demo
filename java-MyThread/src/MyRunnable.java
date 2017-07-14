
public class MyRunnable implements Runnable{
  private int a;
	@Override
	public void run() {
	for(  a=0;a<10;a++)
		{System.out.println(Thread.currentThread().getName()+":"+a);
		  try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
	}
	
	
	public static void main(String[] args) {
		MyRunnable m1=new MyRunnable();
		Thread t1=new Thread(m1);
	     Thread t2=new Thread(m1);
	     //由于t1和t2共享同一个machine对象，
	     //因此在执行run()方法是将操纵同一个实例变量。
	    t1.start();
	    t2.start();
	    //以下方法是由main方法调用，有主线程执行run方法
	    //不提倡如下写法，因为thread的run方法是被自身线程执行的。
	    //m1.run();
		
	}

}
