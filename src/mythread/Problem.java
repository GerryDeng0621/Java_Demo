/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package mythread;


public class Problem implements Runnable {
 int a=1;
 public void run() {
   for(int c=0;c<1000;c++){
     synchronized(this){
     a +=c;
     System.out.println(Thread.currentThread().getName()+" :a= "+a + " c="+c);
     try{Thread.sleep(100);}catch(Exception e){}
     a -=c;
     System.out.println(Thread.currentThread().getName()+" :a= "+a + " c="+c);
     c++;
     }
   }
 }
 public static void main(String args[]) throws InterruptedException{
		Problem mr=new Problem();
		Thread t1=new Thread(mr);
		Thread t2=new Thread(mr);
		t1.start();
 		t2.start();

                Problem mr1=new Problem();
		Thread t3=new Thread(mr1);
		Thread t4=new Thread(mr1);
		t3.start();
 		t4.start();
}
}
