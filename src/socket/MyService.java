/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package socket;
import java.net.*;
import java.io.*;
public class MyService extends Thread{

    Socket s;
    ThreadPool threadPool;
    private boolean status;
    public static final boolean STATUS_BUSY=true;
    public static final boolean STATUS_UNBUSY=false;

    public MyService(ThreadPool pool){
       threadPool=pool;
    }
     public MyService(){

    }

    synchronized public void setStatus(boolean status){
       this.status=status;
       this.notify();
    }
    synchronized public boolean getStatus(){
      return status;
    }

    public void setSocket(Socket s){
      this.s=s;
    }

    public void run(){
      while(true){
         synchronized(this){
           while(!status){
              try{this.wait();} catch(Exception e){}
           }
         }
         try{
            InputStream in = s.getInputStream();
            BufferedReader bin=new BufferedReader(new InputStreamReader(in));
            String data=bin.readLine();
            while(data!=null){
                System.out.println(data);
                data=bin.readLine();
            }//end of while

            bin.close();
            s.close();

        }catch(Exception e){e.printStackTrace();}
        finally{
             threadPool.releaseService(this);
        }

    }

    }//end of run

}// end of class MyService
