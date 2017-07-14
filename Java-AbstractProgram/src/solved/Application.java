package solved;

public class Application {
  public static void main(String[] args) {
	 Geometry c=new Circle(2);
	  Pillar p=new Pillar(c,3);
	   System.out.println("圆形底的柱体的体积是:"+p.getVolume());
	   
	   c=new Rectangle(3,4);
		 p=new Pillar(c,3);
		   System.out.println("矩形底的柱体的体积是:"+p.getVolume());
}
}
