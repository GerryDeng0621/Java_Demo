package designModel;
class Source { 
    public int get220v(){ 
       return 220; 
    } 
}
interface Target { 
    int get110v(); 
    int get220v(); 
}
//通过继承方式
//class Adapter extends Source implements Target{ 
//    public int get110v(){ 
//        return 110; 
//    } 
//}
//通过组合方式
class Adapter  implements Target{ 
	Source source;
	public int get220v()
	{return source.get220v();
	}
    public int get110v(){ 
    	int vol=source.get220v();
    	
        return 110; 
    } 
}

public class AdpterDemo1new {

	public static void main(String rags[]) { 
	        new  AdpterDemo1new().test();
	    } 

	public void test() { 
	        Target target = new Adapter(); 
	        int v1 = target.get110v(); 
	        int v2 = target.get220v(); 
	    } 
	

}
