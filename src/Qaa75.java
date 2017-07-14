/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
public class Qaa75 { 
public static void main(String args[]) { 
String[][][] arr = { 
{ {}, null }, 
{ { "1", "2" }, { "1", null, "3" } }, 
{}, 
{ { "1", null } } 
}; 
System.out.println(arr.length + arr[1][2].length); 
} 
} 
