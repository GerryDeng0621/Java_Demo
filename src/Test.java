/****************************************************
 * �ο��鼮��<<Java���������>>                   *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/


public class Test {

  Test(){};
  public static void main(String[] args) {
    System.out.println(Math.floor(-1.4));
    System.out.println(Math.floor(-1.7));
    System.out.println(Math.floor(1.4));
    System.out.println(Math.floor(1.7));
    System.out.println(Math.ceil(-1.4));
    System.out.println(Math.ceil(-1.7));
    System.out.println(Math.ceil(1.4));
    System.out.println(Math.ceil(1.7));

  }
}

class TestSub extends Test{
 // void Test1(){ Test();};
}

abstract class Employee1{
  String name;
  int salary;

 private int work(){return 0;}

}

 class Manager extends Employee1{


 public void work(){}

  private void work(int a){}

}




