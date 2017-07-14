/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
public class Correct{
  int x;
  void method(){}
  public static void main(String args[]) {
     Correct r=new Correct();
     r.x = 9; // COMPILE SUCCESS!
     r.method();// COMPILE SUCCESS!
  }
}
