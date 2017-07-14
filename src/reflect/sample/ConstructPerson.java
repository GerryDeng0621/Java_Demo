/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package reflect.sample;

import java.lang.reflect.*;

public class ConstructPerson
{
    public static void main(String[] args)
    {
        try
        {
            Constructor c = Person.class.getDeclaredConstructor(
                new Class[] { String.class,int.class });

            Person p = (Person) c.newInstance(
                new Object[] { "linda",new Integer(10) });

            System.out.println(p);
        }
        catch (Exception exc)
        {
            exc.printStackTrace();
        }
    }
}
