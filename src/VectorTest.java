/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/


import java.util.*;

public class VectorTest {

  public VectorTest() {
  }
  public static void main(String[] args) {

    Vector v=new Vector();
    String s="test";
    v.addElement(new String("hello"));
    v.addElement(new Integer(1));
    v.addElement(s);
    v.addElement(s);

    System.out.println(v.size());

    Object o1=v.elementAt(2);
    Object o2=v.elementAt(3);

    System.out.println(v.size());
    System.out.println(o1==o2);


  }
}
