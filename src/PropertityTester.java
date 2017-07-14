/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/



import java.util.*;
public class PropertityTester {
  public PropertityTester() {}

  public static void main(String args[]){
    Properties  p=System.getProperties();
    p.put("password","1234");
    Enumeration k=p.keys();
    Enumeration e=p.elements();

    String userName= (String)p.get("user.name");
    while(k.hasMoreElements()){
      System.out.println(k.nextElement()+ "  :"+ e.nextElement());
    }
  }
}
