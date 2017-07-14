package old;

public class Application {
  public static void main(String[] args) {
	  Circle c=new Circle(2);
	  Pillar p=new Pillar(c,3);
	  System.out.println(p.getVolume());
	
}
}
