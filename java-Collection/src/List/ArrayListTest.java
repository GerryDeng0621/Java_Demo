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
		// ǰ���ǰ�����������������Collectionsʵ����ķ�������
		Collections.sort(al);
		for (Object s : al) {
			System.out.println((String) s);
		}

	}

}