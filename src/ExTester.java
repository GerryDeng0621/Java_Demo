public class ExTester{
  static int method1(int x)throws Exception{
   if(x<0)throw new Exception("x<0");
   return x++;
  }
  
  static int method2(int x)throws Exception{
     return method1(x);
  }
  
  public static void main(String args[])throws Exception{
    System.out.println(method2(-1));
  }
}
