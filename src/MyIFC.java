interface MyIFC{
  void method1();
  void method1(int a);
}
abstract class Base{
  public void method1(){
    System.out.println("hi");
  }  
  protected abstract void method2(); 
}
class Sub extends Base implements MyIFC{
  private int a;
  private static int b;
  public static final int CONST=1;
  
  Sub(){this(-1);}
  Sub(int a){this.a=a;}
  
  public void method1(){a++;}
  public void method1(int a){this.a=a;}
  public void method2(){a--;}
  public static void method3(){b++;}
}
