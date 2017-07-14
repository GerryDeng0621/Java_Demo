/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/


import java.io.*;
public class FileTransfer {

  public FileTransfer() {
  }
  public static void main(String[] args) {
    FileTransfer ft = new FileTransfer();

    ft.reverse("E:\\javalesson\\java_base\\examples\\src\\Correct.java","C:\\out.txt");
    System.out.println(ft.reverse("C:\\out.txt"));
  }


  public static void reverse(String res, String des){


    try {
     InputStream fileIn = new FileInputStream(res);
     OutputStream fileOut = new FileOutputStream(des);
     int i = fileIn.read();
     int count=0;
     while(i!=-1){
        count++;

        if(i!=128) i=-1*i;
        fileOut.write(i);
        i = fileIn.read();
     }

     fileIn.close();
     fileOut.close();
    }
    catch(FileNotFoundException e) {  }
    catch(IOException e) {  }
   }


  public static String reverse(String res){

     byte result[]=null;
     try {
     InputStream fileIn = new FileInputStream(res);
     ByteArrayOutputStream  byteArrayOut= new ByteArrayOutputStream();
     int i = fileIn.read();
     int count=0;
     while(i!=-1){
        count++;

        if(i!=128) i=-1*i;
        byteArrayOut.write((i));
        i = fileIn.read();
     }

     result= byteArrayOut.toByteArray();
     fileIn.close();
     byteArrayOut.close();
    }
    catch(FileNotFoundException e) {  }
    catch(IOException e) {  }

    if(result==null)return null;
    else     return new String(result);

   }







}
