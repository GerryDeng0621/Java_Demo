
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
	     //����t1��t2����ͬһ��machine����
	     //�����ִ��run()�����ǽ�����ͬһ��ʵ��������
	    t1.start();
	    t2.start();
	    //���·�������main�������ã������߳�ִ��run����
	    //���ᳫ����д������Ϊthread��run�����Ǳ������߳�ִ�еġ�
	    //m1.run();
		
	}

}
