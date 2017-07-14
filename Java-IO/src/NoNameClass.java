interface s{
	public void method1();
}

class sImpl implements s
{

	@Override
	public void method1() {
	System.out.println("aaaa");
		
	}
	}
public class NoNameClass {
	
public static void main(String[] args) {
	  //xyz(new sImpl());
	//匿名类
	  xyz(new s(){
		  public void method1() {
				System.out.println("cccc");
					}}
	  );
	  }
	
//回调
 public static void xyz(s s1 )
 {s1.method1();
	 
 }
}
