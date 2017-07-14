/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
public class ParaTest{
    public int v=0;

    public static void main(String args[]){
	    //声明并初始化4个局部变量
	    int p1=0; // p1是基本数据类型
	    ParaTest p2=new ParaTest(); //p2 是对象引用类型
	    ParaTest p3=new ParaTest();//p3 是对象引用类型
	    int[] p4={0}; //p4 是数组引用类型
        		
	    //将4个局部变量作为参数传递给changeParameter()方法
        changeParameter(p1, p2, p3, p4);					
        //打印4个局部变量
        System.out.println("p1= " +p1);
        System.out.println("p2.v= " + p2.v);
        System.out.println("p3.v= " + p3.v);
        System.out.println("p4[0]= " +p4[0]);
    				
    }

    public static void changeParameter(int p1, ParaTest p2, ParaTest  
    p3, int[] p4)
    {
		p1=1; //改变基本数据类型参数的值
		p2.v=1; //改变对象类型参数的实例变量
		p3=new ParaTest();  //改变对象类型参数的引用，使它引用一个新的对象
		p3.v=1; //改变新的对象的实例变量
		p4[0]=1; //改变数组类型参数的元素
    }
}
