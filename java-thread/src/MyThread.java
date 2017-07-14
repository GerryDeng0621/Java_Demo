/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

public class MyThread extends Thread{

  public static void doSomething(){
    for(int a=0;a<50;a++)
    {
      try{
      Thread.sleep(100);
      }catch(Exception e){}

      System.out.println(Thread.currentThread().getName()+" "+a);
    }
  }
  public void run(){
    doSomething();
  }

public static void main(String args[]){
  MyThread  t1=new  MyThread();


  //t1.run(); //This method is executed by main thread
  t1.start();
  t1.doSomething();

}
}

