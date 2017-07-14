/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package reflect.sample;

public class Person implements java.io.Serializable
{
    public String name;
    public int age;



    public Person(String name, int age)
    {
            this.name=name;
            this.age=age;
     }



    public String getName()
    {
        return name;
    }

    public void setName(String name)
       {
        this.name=name;
    }

     public int getAge()
    {
        return age;
    }

    public void setAge(int name)
       {
        this.age=age;
    }



    public String toString()
    {


        return "name =" +name +" age="+age;
    }
}
