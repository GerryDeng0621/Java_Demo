
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
		//�����������߳�
	    m1.start();
	    m1.start();//�߳�ֻ������һ�Σ�������׳��쳣��
	    //m1.run();
		
	}

}
