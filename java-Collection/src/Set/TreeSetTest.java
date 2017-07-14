package Set;
import java.util.Iterator;
import java.util.*;

public class TreeSetTest {
    public static void main(String[] args) {
    method1();
    }
    
    public static void method1()
    {       Set ts = new TreeSet();
    ts.add("abc");
    ts.add("xyz");
    ts.add("rst");
    Iterator it = ts.iterator();
    while (it.hasNext()) {
        System.out.println(it.next());
    }}
    
    
    
    
    //使用排序时，类型要一致
    public static void method2()
    {     Set ts = new TreeSet();
    ts.add("4");
    ts.add(4);

    Iterator it = ts.iterator();
    while (it.hasNext()) {
        System.out.println(it.next());
    }
    	
    }
}
