/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
public class DefaultValue{

public static void main(String args[]){

Sample d=new Sample();
d.a=new DefaultValue();

d.s[0]=new String("123");
System.out.println(d);
System.out.println(d.a);
System.out.println(d.b);
System.out.println(d.s[0]);
System.out.println(d.s[1]);
}

}

class Sample{
 boolean b;
 DefaultValue a;
 String s[]=new String[2];

}

