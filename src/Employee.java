/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
public class Employee {
private String name;
private int salary;

public Employee(String n, int s) {
  name = n;
  salary = s;
}

public Employee(String n) {

  this(n, 0);


}

public Employee() {
  this( " Unknown " );
}

public static void main(String args[]){

  Employee zhangsan=new Employee("Zhangsan", 1000);
  Employee lisi=new Employee("Lisi");
   Employee unknown=new Employee();

   System.out.println(unknown.name);
   System.out.println(unknown.salary);

}


public boolean equals(Object o){
  if( ! (o instanceof Employee)) return false;

  Employee e=(Employee)o;

  if(e.name.equals(name))return true;
  else return false;


}

}
