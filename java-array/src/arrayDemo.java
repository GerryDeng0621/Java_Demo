import java.util.Arrays;


public class arrayDemo {
	
public static void main(String[] args) {
	
int []x=new int[]{1,3,2,4,0};
System.out.println(Arrays.binarySearch(x,2));
Arrays.sort(x);
System.out.println(Arrays.toString(x));
int z[]=Arrays.copyOf(x,3);
System.out.println(Arrays.toString(z));
int y[]=new int[3];
System.arraycopy(x,0,y, 0,y.length);
System.out.println(Arrays.toString(y));
Arrays.fill(x,9);
System.out.println(Arrays.toString(x));
}
}
