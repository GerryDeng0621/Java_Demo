package List;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListTest {
	public static void main(String[] args) {
	  LinkedList al = new LinkedList();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		for(Iterator i = al.iterator();i.hasNext(); ){
		String str = (String) i.next();
		System.out.println(str);
		}
		System.out.println("_____");
		al.addFirst("z");
		al.addLast("x");
		for(Iterator i = al.iterator();i.hasNext(); ){
		String str = (String) i.next();
		System.out.println(str);
		}
		

		}
}
