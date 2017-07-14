/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package mythread;
public class MyJoin implements Runnable {
 int a;
 public void run() {
 while(a<50)System.out.println(a++);
 }

public static void main(String args[]) throws InterruptedException{
		MyJoin mr=new MyJoin();
		Thread t=new Thread(mr);
		t.start();
                try{
                    Thread.sleep(3000);
                    }catch(Exception e){}

        	System.out.println("Main thread: wait");
		t.join();
		System.out.println("Main thread: end");
}
}

