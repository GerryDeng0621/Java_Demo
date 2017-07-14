/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/


import java.io.*;

public class FileReaderSample {
 public static void main(String args[]) {
   FileReaderSample frs=new FileReaderSample();
   System.out.println("begin read1 ............");
   frs.read1();

   System.out.println("begin read2 ............");
   frs.read2();
 }

 public void read1(){

  byte buff[] = new byte[80];
  try {
   InputStream fileIn = new FileInputStream("C:\\in.txt");
   int i = fileIn.read(buff);
   String s = new String(buff);
   System.out.println(s);
  }
  catch(FileNotFoundException e) {  }
  catch(IOException e) {  }
 }


 public void read2(){

  try {
   InputStream fileIn = new FileInputStream("C:\\in.txt");
   BufferedInputStream bis=new BufferedInputStream(fileIn);
   DataInputStream dataIn=new  DataInputStream (bis);
   String  data=dataIn.readLine();

   while(data!=null){
     System.out.println(data);
     data=dataIn.readLine();
   }



  }
  catch(FileNotFoundException e) {  }
  catch(IOException e) {  }
 }

 public void read3() throws IOException{
     FileInputStream in=new FileInputStream("c:\\in.txt");
     int data;
     while((data=in.read())!=-1)
       System.out.print(data +" ");
     in.close();
 }

 
}
