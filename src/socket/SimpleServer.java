/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package socket;
import java.net.*;
    import java.io.*;

public class SimpleServer {
    public static void main(String args[]) {
        ServerSocket s = null;
        Socket s1;
        String sendString = "Hello Net World!!";
        OutputStream s1out;
        DataOutputStream dos;

        // Register your service on port 5432
        try {
                    s = new ServerSocket(5432);
        } catch (IOException e) { }

        int count=1;
        // Run the listen/accept loop forever
        while (true) {
        try {
        // Wait here and listen for a connection
        s1=s.accept();
        System.out.println("accept a new client"+count++);
        // Get a communication stream for socket
        s1out = s1.getOutputStream();
        dos = new DataOutputStream (s1out);

        // Send your string! (UTF provides machine-independent format)
        dos.writeUTF(sendString);

        // Close the connection, but not the server socket
        dos.close();
        s1.close();
        } catch (IOException e) { }
        } //end of while loop
    } //end of method main()
    } //end of class SimpleServer


