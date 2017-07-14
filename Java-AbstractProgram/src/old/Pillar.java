package old;

public class Pillar {
	Circle bottom;
	double height;
	
	Pillar(Circle bottom,double height)
	{ this.bottom=bottom;
	  this.height=height;
	}
	
	public double getVolume(){
		return bottom.getArea()*height;
	}
	
	
}
