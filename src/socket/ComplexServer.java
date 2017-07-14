/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package socket;
import java.net.*;
import java.io.*;

class Operator extends Thread{
    ComplexServer server;
    Socket s;

    public Operator(ComplexServer _server,Socket _s){
        server=_server;
        s=_s;
    }

    public void run(){
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
            //server.delCount();
        }catch(Exception e){e.printStackTrace();}
        finally{server.delCount();}



    }//end of run

}// end of class MyService




public class ComplexServer {

    ServerSocket ss;

    final int MAX_COUNT=5;
    int connectCount=0;

    public synchronized void addCount(){connectCount++; System.out.println("After addCount, connectCount="+ connectCount);}
    public synchronized void delCount(){connectCount--; System.out.println("After delCount, connectCount="+ connectCount);}
    public synchronized boolean isCountExceed(){if(connectCount>MAX_COUNT)return true; else return false;}

    //public  void addCount(){connectCount++; System.out.println("After addCount, connectCount="+ connectCount);}
    //public  void delCount(){connectCount--; System.out.println("After delCount, connectCount="+ connectCount);}
    //public  boolean isCountExceed(){if(connectCount>MAX_COUNT)return true; else return false;}

    public static void main(String args[]) {
    	new ComplexServer().go();
    }

    public void go() {

        // Register your service on port 5432
        try {
    		    ss = new ServerSocket(5432);
        } catch (IOException e) { }

        // Run the listen/accept loop forever
        while (true) {
            try {

                while(isCountExceed()){
                    try{ Thread.sleep(100);}catch(Exception e){}
                }

                // Wait here and listen for a connection
                Socket s=ss.accept();
                addCount();
                Operator ms=new Operator(this, s);
                ms.start();
            }catch(Exception e){e.printStackTrace();}
        } //end of while loop
    } //end of method go()
} //end of class ComplexServer


