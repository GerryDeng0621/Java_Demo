//class Customer extends Thread{
//	public void run()
//	{System.out.println(this.currentThread().getName()+"�ȴ�"+);
//		
//	}
//}
class Caker extends Thread{

	public void run() {
		System.out.println("����ʦ��ʼ��������");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println("����ʦ�����군��");
	
	}
	
}
public class makeCake {
public static void main(String[] args) throws InterruptedException {
	System.out.println("�˿�ѡ�񵰸⣬�ȴ�����ʦ��������");
	Caker c=new Caker();
	c.start();
	c.join();
	System.out.println("�˿͸�Ǯ�����ߵ���");
}
}
