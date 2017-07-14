package designModel;

interface Source{
	public int add(int a,int b);
}
class SourceImpl implements Source{
	public int add(int a,int b){
		return a+b;
	}
}

interface Target{
	public int addOne(int a);
}

//继承实现方式
class TargetImp1 extends SourceImpl implements Target{
	
	public int addOne(int a){
		return add(a,1);
	}
}
//组合实现方式
class TargetImp2 implements Target{
	private Source s ;
	public TargetImp2(Source s){
		this.s = s;
	}
	public int addOne(int a){
		return s.add(a,1);
	}
}



	
public class AdapterDemo{
	public static void main(String[] args) {
		Source s = new SourceImpl();
		Target t = new TargetImp1();
	//	Target t = new TargetImp2(s);
	   	System.out.println("2+1="+t.addOne(2));	
	}

}
