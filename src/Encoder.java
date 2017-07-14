/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

import java.util.*;

public class Encoder {



  public static void main(String args[])throws Exception{

String s="你好！";
    byte[] gbk=s.getBytes("GBK");
    byte[] utf=s.getBytes("UTF8");

    printByteArray(gbk); //-60  -29  -70  -61  -93  -95  
    printByteArray(utf);//63  63  63 
    String gbk_string=new String(gbk,"GBK");
    String utf_string=new String(utf,"UTF8");

    System.out.println("gbk_string.equals(utf_string):"+gbk_string.equals(utf_string) );
    System.out.println(gbk_string);
    System.out.println(utf_string);
  }

  public static void printByteArray(byte[] b){
    String s="";
    for(int i=0;i<b.length;i++)
      s=s+b[i]+"  ";
   System.out.println(s);
  }

}
