package solved;

public class Application {
  public static void main(String[] args) {
	 Geometry c=new Circle(2);
	  Pillar p=new Pillar(c,3);
	   System.out.println("Բ�ε׵�����������:"+p.getVolume());
	   
	   c=new Rectangle(3,4);
		 p=new Pillar(c,3);
		   System.out.println("���ε׵�����������:"+p.getVolume());
}
}
