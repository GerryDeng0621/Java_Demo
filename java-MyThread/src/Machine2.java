
public class Machine2  extends Thread{
  private int a;
	@Override
	public void run() {
	for( a=0;a<50;a++)
		//thread���currentThred�������ص�ǰ�̵߳����ã�
		//getName�����̵߳�����,ÿ���߳��и�Ĭ�ϵ����֡�
	{System.out.println(currentThread().getName()+":"+a);
		  try {
			 //�÷����õ�ǰ�̷߳���cpu����˯������ʱ��
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
	    //���·�������main�������ã������߳�ִ��run����
	    //���ᳫ����д������Ϊthread��run�����Ǳ������߳�ִ�еġ�
	    m1.run();
		
	}

}
