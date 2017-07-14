package Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetTest {
public static void main(String[] args) {
	Set s=new HashSet();
	s.add("hello");
	s.add("world");
	s.add("beijing");
	System.out.println(s.size());
	Iterator i=s.iterator();
	while(i.hasNext())
	{System.out.println(i.next());}
	  
	
	for(Object s1:s.toArray()){
		System.out.println((String)s1);
	}
		
	}

   

}
