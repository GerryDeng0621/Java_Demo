/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package socket;
import java.net.*;
   import java.io.*;

   public class SimpleClient {
   public static void main(String args[]) throws IOException {

   Socket s1;
   InputStream s1In;
   DataInputStream dis;

   // Open your connection to sunbert, at port 5432
   s1 = new Socket("localhost",5432);

   // Get an input file handle from the socket and read the input
   s1In = s1.getInputStream();
   dis = new DataInputStream(s1In);

   String st = new String (dis.readUTF());
   System.out.println(st);

   // When done, just close the connection and exit
   s1In.close();
   s1.close();
   } //end of method main()
   } //end of class SimpleClient()

