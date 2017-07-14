/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
import java.io.*;
public class IOTest{
public static void main(String [] args)throws Exception{

//system.in
DataInputStream di=new DataInputStream(System.in);
String s=di.readLine();
System.out.println(s);
System.out.println();
System.out.println(System.in.read());
//construct reader
BufferedReader in=new BufferedReader(new FileReader("c:\\in.txt"));

//construct writer
FileOutputStream fo=new FileOutputStream("c:\\out.txt",true);
//OutputStreamWriter ow=new OutputStreamWriter(fo,"UTF8");
OutputStreamWriter ow=new OutputStreamWriter(fo,"US-ASCII");
BufferedWriter bw =new BufferedWriter(ow);
PrintWriter out=new PrintWriter(bw,true);

//read and write data
String data=in.readLine();
while(data!=null){
out.println(data);
data=in.readLine();
}
//close reader and writer
in.close();
out.close();
}
}

