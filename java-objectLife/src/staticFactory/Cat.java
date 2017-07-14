package staticFactory;

public class Cat implements Animal{
	static{
		System.out.println("Cat here ");
	}
	public void cry()
	{System.out.println("miaomiao");}
}
