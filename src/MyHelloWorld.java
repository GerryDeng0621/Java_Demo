/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
   
   /**
    * 显示HelloWorld字符串
    */
   public class MyHelloWorld{
    /**
     * 在main( )方法中使用的字符串
     * @see #main(java.lang.String[])
     */
     private static String sDisplay="HelloWorld";

    /**
     * 显示HelloWorld
     * @param args 从命令行中带入的字符串
     * @return 无
     */
     public static void main(String args[]){
       System.out.println(sDisplay);
     }
   
   }
