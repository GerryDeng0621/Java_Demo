package singleton;
class Cat{
	String name;
	Cat(){
		this.name="С��";
	}
	Cat(String name){
		this.name=name;
	}
	public String toString(){
		return name;
	}
}
public class Demo {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	
	//Cat c=new Cat("С��");
	//System.out.println(c.toString());
	Cat c=(Cat)Class.forName("singleton.Cat").newInstance();
	System.out.println(c.toString());
}
}
