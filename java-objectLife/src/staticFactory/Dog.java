package staticFactory;

public class Dog  implements Animal{
	static{
		System.out.println("Dog here ");
	}
	public void cry()
	{System.out.println("wangwang");}
}
