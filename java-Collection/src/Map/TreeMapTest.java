package Map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		Map m=new TreeMap();
		m.put("1","小明");
		m.put("4","效力");
		m.put("3","小陈 ");
		m.put("2","小刘");
		Iterator i=m.entrySet().iterator();
		while(i.hasNext())
		{Map.Entry entry=(Map.Entry)i.next();
			System.out.println(entry.getKey()+"="+entry.getValue());}
	
	}
	}

