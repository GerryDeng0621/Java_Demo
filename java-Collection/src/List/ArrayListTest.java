package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List al = new ArrayList();
		al.add("a");
		al.add("d");
		al.add("c");
		al.add("b");

		for (Iterator i = al.iterator(); i.hasNext();) {
			String str = (String) i.next();
			System.out.println(str);
		}
		// 前面是按索引排序，下面利用Collections实用类的方法排序
		Collections.sort(al);
		for (Object s : al) {
			System.out.println((String) s);
		}

	}

}