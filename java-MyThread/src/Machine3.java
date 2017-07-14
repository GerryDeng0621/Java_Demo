
public class Machine3  extends Thread{
  private int a;
	@Override
	public void start()
	{super.start();
	//run();
	}
	
	public void run() {
	for( a=0;a<10;a++)
	{System.out.println(currentThread().getName()+":"+a);
		  try {
				sleep(100);
		} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
	}
	
	
	public static void main(String[] args) {
		Machine3 m1=new Machine3();
		//启动的是主线程
	    m1.start();
	    m1.start();//线程只能启动一次，否则会抛出异常。
	    //m1.run();
		
	}

}
