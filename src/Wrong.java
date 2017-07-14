/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
public class Wrong {
  int x;
  void method(){}

  static int y;
  static void method1(){}

   public  void test(String args[]) {

      this.x = 9;
      this.method();

      y=1;
      method1();
  }

  public static void main(String args[]) {
      Wrong w=new Wrong();
      w.test(null);

      w.x = 9; // COMPILER ERROR!
      w.method();// COMPILER ERROR!

      y=1;
      method1();
  }
}

