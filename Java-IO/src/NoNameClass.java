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
	//������
	  xyz(new s(){
		  public void method1() {
				System.out.println("cccc");
					}}
	  );
	  }
	
//�ص�
 public static void xyz(s s1 )
 {s1.method1();
	 
 }
}
