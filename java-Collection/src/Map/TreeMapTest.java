package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		Map m=new TreeMap();
		m.put("1","С��");
		m.put("4","Ч��");
		m.put("3","С�� ");
		m.put("2","С��");
		Iterator i=m.entrySet().iterator();
		while(i.hasNext())
		{Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry.getKey()+"="+entry.getValue());}
	
	}
	}

