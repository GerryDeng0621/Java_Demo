import java.io.DataInputStream;
import java.io.IOException;

import org.junit.Test;


public class Demo1 {
public static void main(String[] args) {
	Demo1 demo=new Demo1();
	try {
		demo.method4();
	} catch (Exception e) {
	
		//e.printStackTrace();
		System.out.println(e.getMessage());
	}
	

	//demo.method1();
//	System.out.println(demo.method2(-1));
}

public void method1()
{try {
	System.out.println("Begin");
	System.exit(0);
} catch (Exception e) {
}
finally
{System.out.println("end");
}}

public int  method2(int a){
	try {
		System.out.println("begin");
		if (a<0) throw new Exception("aaaa");
		return 100;
	} catch (Exception e) {
		System.out.println(e.getMessage());
		return -100;
	}
	finally{
		System.out.println("end");
	}	
	}

public void method3() throws java.lang.Exception
{throw new java.lang.Exception("ccccc");
// File f=new File("d:/eee.txt");
// FileInputStream is=new FileInputStream(f);
// is.read();
 }



public void method4() throws IOException
{//{ DataInputStream din=new DataInputStream(System.in);
//  System.out.println(din.readC());
System.out.println(System.in.read());
	}
}

