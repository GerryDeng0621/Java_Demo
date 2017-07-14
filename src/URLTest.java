/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/



import java.io.*;
import java.net.URL;
public class URLTest {

  public URLTest() {
  }

  public static void main(String args[]){
    InputStream is = null;
   
    try {
 	URL url= new URL("http://www.javathinker.org/weiqin/sole.htm");
        is = url.openStream();
        byte buffer[] = new byte[2048]; 
        is.read(buffer,0,buffer.length);
        System.out.println(new String(buffer));
   } catch (IOException e){}
  }
}
