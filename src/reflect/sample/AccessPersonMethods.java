/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package reflect.sample;

import java.lang.reflect.*;

public class AccessPersonMethods
{
    public static void main(String[] args)
    {
        try
        {
Person person=new Person("linda",10);

invokeAllMethods(person);
/*
Class personClass=person.getClass();
Class[] parameterClass={int.class};

Method setAgeMethod=personClass.getMethod("setAge",parameterClass);
parameterClass=new Class[0];
Method getAgeMethod=personClass.getMethod("getAge",parameterClass);
//设定person的年龄
Object params[]=new Object[1];
params[1]=new Integer(12);
setAgeMethod.invoke(person, params);
//获得person的年龄
Object ageObject=getAgeMethod.invoke(person, new Object[0]);
int age=((Integer)ageObject).intValue();
System.out.print(age);
*/

        }
        catch (Exception exc)
        {
            exc.printStackTrace();
        }
    }

static public void invokeAllMethods(Object o) throws Exception{
  Class c=o.getClass();
  Method[] ms=c.getMethods();

  for(int i=0;i<ms.length;i++){
    System.out.println(ms[i].getName());

    Class[] paraTypes=  ms[i].getParameterTypes();
    Object[] paras=createParameter(paraTypes);

    try{
    ms[i].invoke(o, paras);  //o.setImage(12);
    }catch(Exception e){}
  }

}


static private Object[] createParameter(Class[] paraTypes)throws Exception{
  Object[] result=new Object[paraTypes.length];

  for(int i=0;i<paraTypes.length;i++){
    result[i]=paraTypes[i].newInstance();

  }

  return result;
}

}
