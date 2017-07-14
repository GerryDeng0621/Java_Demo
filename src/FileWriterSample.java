/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/



import java.io.*;
public class FileWriterSample {


  public static void main(String args[]) {
    FileWriterSample fws=new FileWriterSample();
    fws.write2();
 }

 public void write1(){
  byte buff[] = new byte[80];
    try {
     FileOutputStream fileOut = new FileOutputStream("C:\\out.txt");
     fileOut.write("你好".getBytes());
     fileOut.close();
    }
    catch(FileNotFoundException e) {  }
    catch(IOException e) {  }
 }

 public void write2(){
   try {
     FileOutputStream fileOut = new FileOutputStream("C:\\out.txt");
     DataOutputStream dos=new DataOutputStream(fileOut);

     dos.writeUTF("line1 ");
     dos.writeUTF("你好 ");
     dos.writeUTF("line3 ");
     dos.close();


    }
    catch(FileNotFoundException e) {  }
    catch(IOException e) {  }

 }
}
