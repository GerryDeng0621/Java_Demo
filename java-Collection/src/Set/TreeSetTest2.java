package Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetTest2 {
     @SuppressWarnings("unchecked")
    public static void main(String[] args) {
            Set ts = new TreeSet();
            ts.add(new Teacher("zhangsan", 1));
            ts.add(new Teacher("lisi", 2));
            ts.add(new Teacher("wangmazi", 3));
            ts.add(new Teacher("wangwu",4));
            ts.add(new Teacher("mazi", 3));
            Iterator it = ts.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
}
class Teacher implements Comparable {
    int num;
    String name;

    Teacher(String name, int num) {
        this.num = num;
        this.name = name;
    }

    public String toString() {
        return "ѧ�ţ�" + num + "\t\t������" + name;
    }

    //o�д��ʱ�ĺ�ڶ������еĽڵ㣬�Ӹ��ڵ㿪ʼ�Ƚ�
    public int compareTo(Object o) {
        Teacher ss = (Teacher) o;
  //      int result = num < ss.num ? 1 : (num == ss.num ? 0 : -1);//����
     int result = num > ss.num ? 1 : (num == ss.num ? 0 : -1);//����
        if (result == 0) {
            result = name.compareTo(ss.name);
        }
        return result;
    }
}