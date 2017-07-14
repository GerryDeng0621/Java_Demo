/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package mythread;


public class Changer extends Thread{

  private boolean isBusy;
  private String mycolour;

  public Changer(String mycolour){this.mycolour=mycolour;}
  public String getColour(){return mycolour;}
  public void setColour(String c){mycolour=c;}


  public void run(){
    doSomething();
  }

  synchronized boolean isBusy(){
    return isBusy;
  }
  synchronized void setBusy(){
     while(isBusy()){
         try{ this.wait();} catch(Exception e){e.printStackTrace();}
     }

     isBusy=true;
  }

  synchronized void setUnBusy(){
    this.notify();
    isBusy=false;


  }

   public  void doSomething(){
    while(true)
    {

     setBusy();

     Thread[] ts=new Thread[Thread.activeCount()];
     Thread.enumerate(ts);
     Changer currThread=(Changer)(Thread.currentThread());
     Changer anotherThread=null;
     for(int i=0;i<ts.length;i++)
     {
          if(ts[i]!=currThread && ts[i] instanceof Changer && !((Changer)ts[i]).isBusy())
          {anotherThread=(Changer)ts[i];anotherThread.setBusy();break;}
     }

     if(anotherThread==null) {setUnBusy(); continue;}
     System.out.println(currThread.getName()+" currthread: "+currThread.getColour());
     System.out.println(currThread.getName()+" anotherthread: "+anotherThread.getName()+" :"+anotherThread.getColour());
     String tmp=currThread.getColour();
     currThread.setColour(anotherThread.getColour());
     anotherThread.setColour(tmp);
     System.out.println(currThread.getName()+" afterchanged: "+currThread.getColour());

     setUnBusy();
     anotherThread.setUnBusy();

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
