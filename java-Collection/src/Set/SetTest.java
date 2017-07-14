package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
public static void main(String[] args) {
	Set s=new HashSet();
	String s1="aaa";
	String s2=new String("aaa");
	s.add(s1);
	s.add(s2);
	s.add("ccc");
	s.add("bbb");
	System.out.println(s.size());
	Iterator i=s.iterator();
	while(i.hasNext())
	{System.out.println(i.next());}
}
}
