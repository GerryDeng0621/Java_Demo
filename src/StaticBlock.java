/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
 public class StaticBlock{

static int i = 5;
int j=1;

static {
     System.out.println(" First Static code i= "+ i++ );
}
 static {
    System.out.println(" Second Static code i= "+ i++ );
 }
 public static void main(String args[]) {
        System.out.println("begin main method");
	StaticBlock s1=new StaticBlock();
	StaticBlock s2=new StaticBlock();
        System.out.println("At last, i= "+ i );
 }
}
