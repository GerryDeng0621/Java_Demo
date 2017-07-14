/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
class A{

  static int aV;
  int bV;

  static class B{

    void test(){
      aV=1;
      //bV=1;

    }


  }


  class C{

   void test(){
      aV=1;
      bV=1;

    }

  }
  public void method(){

     A a=new A(){



     };


     int v1=0;
     final int v2=0;

     class D{

       void test(){
        aV=1;
        bV=1;

        //aV=v1;
        aV=v2;

      }


     }

     B b=new B();
     C c=new C();
     D d=new D();

  }
}

class B{
	public void test(){
		A.B b=new A.B();
                A.C c=new A().new C();
                //A.D d=new A().new D();


	}


}


