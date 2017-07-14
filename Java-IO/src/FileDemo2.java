import java.io.File;
import java.io.UnsupportedEncodingException;

import org.junit.Test;

class Cat implements Cloneable{
	String name="cat1";
	public String toString()
	{return name;
}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

public class FileDemo2 {
public static void main(String[] args) throws UnsupportedEncodingException, CloneNotSupportedException {
	Cat c1=new Cat();
	Cat c2=(Cat)c1.clone();
	System.out.println(c2);
	c2.name="cat2";
	System.out.println(c1);
	
	
	

}


}
