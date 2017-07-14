/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package mypackage;
/**
* My Javadoc test file <b>Helloworld</b>
* @author : Linda
* @version 1.0 2002/01/15
*/
public class MyHelloWorld
{
/**
* 在main( )方法中使用的字符串
* @see #main(java.lang.String[])
*/
static String SDisplay;

/**
* 显示HelloWorld
* @param args 从命令行中带入的字符串
* @return 无
*/
public static void main(String args[])
{

//assignment
SDisplay = "Hello World " ;
System.out.println( SDisplay );
}
}
