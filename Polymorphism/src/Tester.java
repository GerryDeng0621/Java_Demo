import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


class Fathers {
	String var = "FatherVar";
	static String staticVar = "StaticFatherVar";

	void method() {
		System.out.println("Father method");
	}

	static void staticMethod() {
		System.out.println("Static Father method");
	}
}

class Sons extends Fathers {
	String var = "SonVar";
	static String staticVar = "StaticSonVar";

	void method() {
		System.out.println("Son method");
	}

	static void staticMethod() {
		System.out.println("Static Son method");
	}

	String sonVar = null;

	void sonMethod() {
	}
}

public class Tester {

	public void test() {
		Fathers f = new Sons();
	
		// Fathers f=new Fathers();
		// Sons f=new Sons();
		// Sons f=(Sons)new Fathers();

		System.out.println(f.var);
		System.out.println(f.staticVar);
		f.method();
		f.staticMethod();
	}

	public void testIdentity(Fathers f) {

		if (f instanceof Fathers)
			System.out.println("father");
		if (f instanceof Sons)
			System.out.println("son");
		if (!(f instanceof Fathers))
			System.out.println("else");

	}

	public static void main(String args[]) {
	//	new Tester().test();
		new Tester().testIdentity(new Sons());
//		Fathers f=new Fathers();
//		Sons s=(Sons)f;
	}
}
