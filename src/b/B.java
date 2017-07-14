/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
  /** B.java */
  package b;
  import a .*; //import package a
  public class B{
    public static void main(String args[]){
      A a; //access class A
      a=new A();
    }
  }
