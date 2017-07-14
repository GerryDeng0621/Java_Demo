/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package reflect;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.*;
import java.sql.ResultSet;

public class SqlTranslater extends Translater{
    public SqlTranslater(){}

    public SqlTranslater(Object _o){
        super(_o);
    }

    private String combineGetFields (){
        String sql="";

        int c1=0;
        for(int a=0;a<m_fields.length;a++){
            try{
                if(c1==0 && m_isGetFields[a].getBoolean(m_object))
                {
                sql=sql+m_fields[a].getName();
                c1++;
                }else
                if(c1!=0 &&  m_isGetFields[a].getBoolean(m_object))
                sql=sql+","+m_fields[a].getName();
            }catch(Exception e){}
        }
        return sql;
    }

    public String getWhereClause(){

        String sql=""; 

        //combine where clause
        int c1=0;
        for(int a=0;a<m_fields.length;a++){

            try{
                if(c1==0 && m_isSetFields[a].getBoolean(m_object))
                {
                    sql=sql+" where "+m_fields[a].getName()+"＝"+ "\'"+m_fieldValues[a]+"\'";
                    c1++;
                }
                else
                    if(c1!=0 && m_isSetFields[a].getBoolean(m_object))
                        sql=sql+" and "+m_fields[a].getName()+"＝"+ "\'"+m_fieldValues[a]+"\'";
            }catch(Exception e){}
        }
        return sql;

    }//end of getWhereClause


    public String getValueClause(){

        String sql=""; 
        String sql1="(";
        String sql2=" values(";

        //combine value clause
        int c1=0;
        for(int a=0;a<m_fields.length;a++){

            try{
                if(c1==0 && m_isSetFields[a].getBoolean(m_object))
                {
                    sql1=sql1+m_fields[a].getName();
                    sql2=sql2+"\'"+m_fieldValues[a]+"\'";
                    c1++;
                }
                else
                if(c1!=0 && m_isSetFields[a].getBoolean(m_object))
                {
                    sql1=sql1+","+m_fields[a].getName();
                    sql2=sql2+","+"\'"+m_fieldValues[a]+"\'";
                }

            }catch(Exception e){}
        }


        sql1=sql1+")";
        sql2=sql2+")";

        sql=sql1+sql2;

        return sql;

    }//end of getValueClause

    public String getClassName(){
        String s=m_class.getName();
        return s.substring(s.lastIndexOf(".")+1);
    }

    public String transSelect(){ 

        String sql="select " +combineGetFields(); 
        sql=sql+" from " +getClassName()+getWhereClause() ;
        return sql;
    }//end of method transSelect


    public String transSelect(Object _o){
        initInfo(_o);
        return transSelect();
    }


    public String transDelete(){
        String sql="delete "; 
        sql=sql+" from " +m_class.getName()+getWhereClause() ;
        return sql;

    }//end of transDelete

    public String transDelete(Object _o){
        initInfo(_o);
        return transDelete();
    }

    public String transInsert(){
        String sql="insert into "; 
        sql=sql+m_class.getName()+getValueClause();
        return sql;

    }//end of transInsert

    public String transInsert(Object _o){
        initInfo(_o);
        return transInsert();
    }


    public static void main(String args[]){
        new SqlTranslater().test();
    }

    private void test(){

        Table t=new Table(true,true);

        System.out.println(transSelect(t));
        System.out.println(transDelete(t));
        System.out.println(transInsert(t));

    }



}//end of class SqlTranslater

