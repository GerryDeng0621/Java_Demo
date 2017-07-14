/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
public class OuterOne{
class InnerOne extends OuterOne{}
static void thisMethod(){
Object o=(Object)new OuterOne();
OuterOne foo=(OuterOne)o;
}
public static void main(String args[]){
int b1=(1<<31)-1; 
int b3=1<<32;
int b2=1<<31;
b1>>>=31; 
b1>>>=1;
b2>>=31; 
b2>>=1;
System.out.println("B1 = "+b1+"\t"+b2);
}
 }
