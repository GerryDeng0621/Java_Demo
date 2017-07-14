/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package socket;

import java.net.*;
import java.io.*;

public class SocketServer {

    ServerSocket ss;

    public static void main(String args[]) {
    	new SocketServer().go();
    }

    public void go() {
        ThreadPool tp=new ThreadPool();


        // Register your service on port 5432
        try {
    		    ss = new ServerSocket(5432);
        } catch (IOException e) { }

        // Run the listen/accept loop forever
        while (true) {
            try {


                // Wait here and listen for a connection
                Socket s=ss.accept();
                MyService ms=tp.getService(s);


            }catch(Exception e){e.printStackTrace();}
        } //end of while loop
    } //end of method go()
} //end of class SocketServer


