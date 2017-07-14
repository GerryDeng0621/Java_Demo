/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package mythread;
public class MyRunnable implements Runnable{

int a=0;
public void run(){
for( a=0;a<50;a++)
System.out.println(Thread.currentThread().getName()+" "+a);
}
public static void main(String args[]){
MyRunnable  mr=new  MyRunnable ();
Thread t1=new Thread(mr); //Thread(Runnable r)
Thread t2=new Thread(mr);
t1.start();
t2.start();

}
}
