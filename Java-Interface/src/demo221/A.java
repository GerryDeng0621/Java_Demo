package demo221;
interface B
{void setValue(int val);
 int getValue();
	}
interface C{}
interface D{}
public interface A extends B ,C{
int CONST=1;
void method1();
public abstract  void method2();

}
abstract class cc implements B{
	//int getValue(){return 0;}
	abstract void increment();
	
}
