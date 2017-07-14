package staticFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.security.auth.login.Configuration;





public class demo1 {
public static void main(String[] args) {
	try {
		MyUtil myUtil=new MyUtil();
    	String class1=myUtil.getProperties("myclass1");
		Animal a=(Animal)Class.forName(class1).newInstance();
		a.cry();
		Animal b=(Animal)Class.forName(myUtil.getProperties("myclass2")).newInstance();
		b.cry();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} 



}

