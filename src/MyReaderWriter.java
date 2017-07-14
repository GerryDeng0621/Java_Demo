/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
import java.io.*;
public class MyReaderWriter{
  public static void main(String [] args)throws Exception{
    new  MyReaderWriter().copyfile("C:\\in.txt","C:\\out.txt");
  }

  public void copyfile(String from, String to)throws Exception{
    FileInputStream fin=new FileInputStream(from);
    InputStreamReader ir=new InputStreamReader(fin);
    BufferedReader in=new BufferedReader(ir);

    FileOutputStream fo=new FileOutputStream(to); 
    OutputStreamWriter ow=new OutputStreamWriter(fo,"ISO8859-1"); 
    //OutputStreamWriter ow=new OutputStreamWriter(fo,"GBK");
    BufferedWriter bw =new BufferedWriter(ow);
    PrintWriter out=new PrintWriter(bw,true);

    String data=in.readLine();
    while(data!=null){
      out.println(data);
      data=in.readLine();
    }
    in.close();
    out.close();
  }
}

