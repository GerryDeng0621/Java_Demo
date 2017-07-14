package designModel.deputyModel;
import static designModel.deputyModel.mypack.MyConstants.*;
public class Circle{
  private double r;  //°ë¾¶
  public Circle(double r){this.r=r;}
  public double getCircumference (){return 2*r* MATH_PI;}
  public double getArea(){return r*r* MATH_PI;}
}




