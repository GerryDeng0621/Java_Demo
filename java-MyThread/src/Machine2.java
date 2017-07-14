
public class Machine2  extends Thread{
  private int a;
	@Override
	public void run() {
	for( a=0;a<50;a++)
		//thread类的currentThred方法返回当前线程的引用，
		//getName返回线程的名字,每个线程有个默认的名字。
	{System.out.println(currentThread().getName()+":"+a);
		  try {
			 //该方法让当前线程放弃cpu并且睡眠若干时间
			sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
	
	
	public static void main(String[] args) {
		Machine2 m1=new Machine2();
	Machine2 m2=new Machine2();
	    m1.start();
	    m2.start();
	    //以下方法是由main方法调用，有主线程执行run方法
	    //不提倡如下写法，因为thread的run方法是被自身线程执行的。
	    m1.run();
		
	}

}
