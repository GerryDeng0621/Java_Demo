package singleton;

public class singletonDemo {
public static void main(String[] args) {
	Singleton s1=Singleton.getInstance();
}
}
//第一种方法
class Singleton {
    //私有的默认构造子
    private Singleton() {}
    //注意，这里没有final    
    private static Singleton single=null;
    //静态工厂方法 
    public static Singleton getInstance() {
         if (single == null) {  
             single = new Singleton();
         }  
        return single;
    }
}
 
//第二种方法
 class Singleton2 {
	    //私有的默认构造子
	    private Singleton2() {}
	    //注意，这里有final    
	    private static final Singleton2 single=new Singleton2();
	    //静态工厂方法 
	    public static Singleton2 getInstance() {
	        
	        return single;
	    }
	}
 
