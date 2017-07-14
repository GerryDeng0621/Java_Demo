package designModel;
interface A{
	void method1();
	void method2();
	void method3();
	void method4();
	void method5();
	void method6();
	void method7();
}

class B implements A
{public void method1(){};
public void method2(){};
public void method3(){};
public void method4(){};
public void method5(){};
public void method6(){};
public void method7(){};
}

public class DefaultAdapterDemo extends B{
  public void method5()
  {System.out.println("我只对第5个方法感兴趣");}
}
