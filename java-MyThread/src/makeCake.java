//class Customer extends Thread{
//	public void run()
//	{System.out.println(this.currentThread().getName()+"等待"+);
//		
//	}
//}
class Caker extends Thread{

	public void run() {
		System.out.println("蛋糕师开始制作蛋糕");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println("蛋糕师制作完蛋糕");
	
	}
	
}
public class makeCake {
public static void main(String[] args) throws InterruptedException {
	System.out.println("顾客选择蛋糕，等待蛋糕师制作蛋糕");
	Caker c=new Caker();
	c.start();
	c.join();
	System.out.println("顾客付钱，拿走蛋糕");
}
}
