/****************************************************
 * �ο��鼮��<<Java���������>>                   *
 * ����֧����ַ��www.javathinker.org                *
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
     fileOut.write("���".getBytes());
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
     dos.writeUTF("��� ");
     dos.writeUTF("line3 ");
     dos.close();


    }
    catch(FileNotFoundException e) {  }
    catch(IOException e) {  }

 }
}
