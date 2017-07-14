/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
/**
	 * Son1.java
	 */
	class Father1
	{
		String var="Father's Variable";
		void method(){System.out.println("call Father's method");}
	}

	public class Son1 extends Father1
	{
		String var="Son's variable";
		void method(){System.out.println("call Son's method");}
		void test()
		{
			String var="Local variable";

                        //print var
			System.out.println("var is "+var);
			System.out.println("this.var is "+ this.var);
			System.out.println("super.var is "+ super.var);

			//call method
			method();
			this.method();
			super.method();
                }

		public static void main(String args[])
		{
			Son1 s=new Son1();
			s.test();
		}
	}
