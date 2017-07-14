package solved;

public class Rectangle extends Geometry{
   double a,b;
   public Rectangle(double a,double b)
   {this.a=a;
    this.b=b;
   
	   
   }
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return a*b;
		
	}
 
}
