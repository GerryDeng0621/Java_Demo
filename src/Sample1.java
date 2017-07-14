/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
public class Sample1{

}


class Sample2{
public Sample2(){}
public Sample2(int a){System.out.println("My Constructor");}
}
class Sample3{
  public Sample3(){System.out.println("My Default Constructor");}


  public void test(){


     Sample2 s2=new Sample2();
     Sample2 s22=new Sample2(1);
     Sample3 s3=new Sample3();

  }

}

