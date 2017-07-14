/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package reflect.sample;

import java.lang.reflect.*;

public class AccessPersonFields
{
    public static void main(String[] args)
    {
        try
        {
Person person=new Person("linda",10);
Class personClass=person.getClass();
Field ageField=personClass.getField("age");

//设定person的年龄
ageField.set(person, new Integer(12));
//获得person的年龄
int age=ageField.getInt(person);
System.out.println(age);

System.out.println(combineSelectSql(person));
System.out.println(combineInsertSql(person));
        }
        catch (Exception exc)
        {
            exc.printStackTrace();
        }
    }


 public static String combineSelectSql(Object o){
	Class c=o.getClass();
        Field[] fs=c.getFields();
        String sql="select " ;
        for(int I=0;I<fs.length;I++){
         sql =sql+fs[I].getName();
         if(I!=fs.length-1) sql=sql+",";
        }

        String s=c.getName(); //reflect.sample.Person
        int lastIndex=s.lastIndexOf(".");
        String tableName=s.substring(lastIndex+1);
        sql=sql +" from " + tableName;

        return sql;

}

public static String combineInsertSql(Object o)throws Exception{
	Class c=o.getClass();
        Field[] fs=c.getFields();
         String s=c.getName();
        int lastIndex=s.lastIndexOf(".");
        String tableName=s.substring(lastIndex+1);
        String sql="insert into  " +tableName +"(" ;
        for(int I=0;I<fs.length;I++){
         sql =sql+fs[I].getName();
         if(I!=fs.length-1) sql=sql+",";
        }


        sql=sql+") values(";
        for(int I=0;I<fs.length;I++){
          Class cf=fs[I].getType();
          if(cf==int.class) sql=sql+fs[I].getInt(o);
          if(cf==String.class) sql=sql+fs[I].get(o);


          if(I!=fs.length-1) sql=sql+",";
        }

        sql=sql+") ";

        return sql;

}
}
