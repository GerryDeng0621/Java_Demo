/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package socket;

import java.net.*;

public class ThreadPool {
  final int MAX_NUM=5;
  MyService[] ms=new MyService[MAX_NUM];


  public ThreadPool() {

     for(int i=0;i<MAX_NUM;i++){
        ms[i]=new MyService(this);
        ms[i].setStatus(MyService.STATUS_UNBUSY);
        ms[i].start();
     }

  }


  public synchronized MyService getService(Socket s){

   while(true){
    for(int i=0;i<MAX_NUM;i++){
        if(!ms[i].getStatus()){
           ms[i].setStatus(MyService.STATUS_BUSY);
           ms[i].setSocket(s);
           return ms[i];
        }
     }

     try{
        this.wait();
     }catch(Exception e){}
   }

  }

  public synchronized boolean releaseService(MyService m){
     this.notify();
     m.setStatus(MyService.STATUS_UNBUSY);
     return true;
  }

}
