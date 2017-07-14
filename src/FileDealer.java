/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
   import java.io.*;

public class FileDealer{

 public static void main(String agrs[]){
   FileDealer d=new FileDealer();
   d.test("C:\\java275");
   d.test("C:\\out.txt");
   d.test("C:\\newDirectory");
 }

 void test(String name){

   File f=new File(name);
   if(!f.exists()) {

     f.mkdir();
     return;
   }

   if(f.isFile())
    System.out.println(f.getAbsolutePath());
   else
   {
     String s[]=f.list();
     for(int i=0;i<s.length;i++)
      System.out.println(s[i]);

   }
 }

}
