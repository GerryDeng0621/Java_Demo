package singleton;

public class singletonDemo {
public static void main(String[] args) {
	Singleton s1=Singleton.getInstance();
}
}
//��һ�ַ���
class Singleton {
    //˽�е�Ĭ�Ϲ�����
    private Singleton() {}
    //ע�⣬����û��final    
    private static Singleton single=null;
    //��̬�������� 
    public static Singleton getInstance() {
         if (single == null) {  
             single = new Singleton();
         }  
        return single;
    }
}
 
//�ڶ��ַ���
 class Singleton2 {
	    //˽�е�Ĭ�Ϲ�����
	    private Singleton2() {}
	    //ע�⣬������final    
	    private static final Singleton2 single=new Singleton2();
	    //��̬�������� 
	    public static Singleton2 getInstance() {
	        
	        return single;
	    }
	}
 
