package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {
public static void main(String[] args) {
	Map m=new HashMap();
	m.put("1","С��");
	m.put("2","Ч��");
	m.put("3","С�� ");
	m.put("4","С��");
	Iterator i=m.entrySet().iterator();
	while(i.hasNext())
	{Map.Entry entry=(Map.Entry)i.next();
		System.out.println(entry.getKey()+"="+entry.getValue());}
}
}
