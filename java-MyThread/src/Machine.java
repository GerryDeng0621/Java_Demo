
public class Machine  extends Thread{
  
	@Override
	public void run() {
	for(int  a=0;a<10;a++)
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
		Machine m1=new Machine();
	Machine m2=new Machine();
	    m1.start();
	    m2.start();
	    //���·�������main�������ã������߳�ִ��run����
	    //���ᳫ����д������Ϊthread��run�����Ǳ������߳�ִ�еġ�
	    m1.run();
		
	}

}
