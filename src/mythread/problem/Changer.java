/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package mythread.problem;


public class Changer extends Thread{

  private String mycolour;

  public Changer(String mycolour){this.mycolour=mycolour;}
  public String getColour(){return mycolour;}
  public void setColour(String c){mycolour=c;}

  public void run(){
    doSomething();
  }

   public  void doSomething(){
    for(int a=0;a<50;a++)
    {
      try{
      Thread.sleep(100*((int)Math.random()));
      }catch(Exception e){}

      synchronized(this){
        Thread[] ts=new Thread[Thread.activeCount()];
        Thread.enumerate(ts);
        Changer currThread=(Changer)(Thread.currentThread());
        Changer anotherThread=null;
        for(int i=0;i<ts.length;i++)
        {
          if(ts[i]!=currThread && ts[i] instanceof Changer ){anotherThread=(Changer)ts[i];break;}
        }

        System.out.println(currThread.getName()+" currthread: "+currThread.getColour());
        System.out.println(currThread.getName()+" anotherthread: "+anotherThread.getColour());
        String tmp=currThread.getColour();
        currThread.setColour(anotherThread.getColour());
        anotherThread.setColour(tmp);
        System.out.println(currThread.getName()+" afterchanged: "+currThread.getColour());
      }
    }
  }

public static void main(String args[]){
  Changer  t1=new  Changer("white");
  Changer  t2=new  Changer("black");
  Changer  t3=new  Changer("green");
  t1.setName("t1");
  t2.setName("t2");
  t3.setName("t3");



  t1.start();
  t2.start();
  t3.start();


}
}
