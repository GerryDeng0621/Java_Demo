/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
	/**
 * Son.java
 */
	class GrandPa
	{
		protected GrandPa()
		{
			System.out.println("default GrandPa");
		}
		public GrandPa(String name)
		{
			System.out.println(name);
		}


	}

class Father extends GrandPa
{

protected Father()
{
     System.out.println("default Father");
}

public Father(String grandPaName,String fatherName)
{
	super(grandPaName);
	System.out.println(fatherName);
}
}

public class Son extends Father
{
public Son()
{
        System.out.println("default Son");
}

public Son(String grandPaName,String fatherName,String sonName)
{
	super(grandPaName,fatherName);
System.out.println(sonName);
}

public static void main(String args[])
{
	//Son s1=new Son();
	Son s2= new Son("My GrandPa", "My Father", "My Son");
}
}
