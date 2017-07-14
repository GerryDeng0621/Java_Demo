/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package socket;
import java.net.*;
import java.util.Date;
import java.io.*; 
   
public class ComplexClient extends Thread{ 

   public static void main(String args[]){
   
     ComplexClient[] m=new ComplexClient[10];
     for(int i=0;i<10;i++){
        m[i]=new ComplexClient();
        m[i].setName("client"+i);
        m[i].start();
     }
   
   }

   public void run() { 
        int c; 
        Socket s1; 
        OutputStream out; 
        PrintStream ps;  
           
        try{
            // Open your connection to sunbert, at port 5432 
            s1 = new Socket("sun",5432); 
               
            // Get an input file handle from the socket and read the input 
            out = s1.getOutputStream(); 
            ps = new PrintStream(out,true); 
              
            for(int i=0;i<100;i++){
           
                ps.println(getName()+ ":"+ new Date().toString());
                sleep(100);
            }//end for

            ps.close(); 
            s1.close(); 	
        }catch(Exception e){} 
      
    } //end of method go() 
} //end of class ComplexClient()
