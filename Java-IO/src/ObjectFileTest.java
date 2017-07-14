import java.io.*;   
import java.util.*;   
  
public class ObjectFileTest   
{   
public static void main(String[] args)   
{   
Manager boss = new Manager("Carl Cracker", 80000, 1987, 12, 15);   
boss.setBonus(5000);     
Employee[] staff = new Employee[3];   
staff[0] = boss;   
staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 15);   
staff[2] = new Employee("Tony Tester", 40000, 1990, 1, 15);   
  
try   
{ ObjectOutputStream out = new ObjectOutputStream(new   
FileOutputStream("employee.dat"));   
out.writeObject(staff); //将对象写入"employee.dat"中    
out.close(); //关闭流，请牢记    
 
ObjectInputStream in = new ObjectInputStream(new   
FileInputStream("employee.dat"));   
///readObject()将对象从"employee.dat"中读出，需要类型转换    
Employee[] newStaff = (Employee[])in.readObject();   
in.close();   
  
for (int i = 0; i < newStaff.length; i++)   
System.out.println(newStaff[i]);   
}   
catch (Exception e)   
{   
e.printStackTrace();   
}   
}   
  
}   
  
///implements Serializable接口为标注该对象是可序列化的  反序列化  
  
class Employee implements Serializable   
{   
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public Employee() {}   
  
public Employee(String n, double s, int year, int month, int day)   
{   
name = n;   
salary = s;   
GregorianCalendar calendar =   
new GregorianCalendar(year, month - 1, day);   
hireDay = calendar.getTime();   
}   
  
public String getName()   
{   
return name;   
}   
  
public double getSalary()   
{   
return salary;   
}   
  
public Date getHireDay()   
{   
return hireDay;   
}   
  
public void raiseSalary(double byPercent)   
{   
double raise = salary * byPercent / 100;   
salary += raise;   
}   
  
public String toString()   
{   
return getClass().getName()   
+ "[name = "+ name   
+ ",salary = "+ salary   
+ ",hireDay = "+ hireDay   
+ "]";   
}   
  
private String name;   
private double salary;   
private Date hireDay;   
  
}   
  
class Manager extends Employee   
{   
public Manager(String n, double s, int year, int month, int day)   
{   
super(n, s, year, month, day);   
bonus = 0;   
}   
  
public double getSalary()   
{   
double baseSalary = super.getSalary();   
return baseSalary + bonus;   
}   
  
public void setBonus(double b)   
{   
bonus = b;   
}   
  
public String toString()   
{   
return super.toString()   
+ "[bonus = "+ bonus   
+ "]";   
}   
  
private double bonus;   
  
}  
