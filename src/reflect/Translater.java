/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package reflect;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.util.*;

public class Translater{

    public Translater(){}
    public Translater(Object _o){
        initInfo(_o);
    }
    protected Object m_object;
    protected Class m_class;
    protected Field[] m_fields;
    protected Field[] m_isGetFields;
    protected Field[] m_isSetFields;
    protected String[] m_fieldValues;


    protected void initInfo(Object _o){
        m_object =_o;
        m_class=_o.getClass();

        Field[] fields=m_class.getFields();
        m_fields=new Field[fields.length/3];
        m_isGetFields=new Field[fields.length/3];
        m_isSetFields=new Field[fields.length/3];

        int c1=0;
        int c2=0;
        int c3=0;
        for(int a=0;a<fields.length;a++){
            if((a % 3)==0)m_fields[c1++]=fields[a];
            if((a % 3)==1)m_isGetFields[c2++]=fields[a];
            if((a % 3)==2)m_isSetFields[c3++]=fields[a];
        }

        m_fieldValues=new String[m_fields.length];
        for(int a=0;a<m_fields.length;a++){
            m_fieldValues[a]=getStringValueOfField(m_fields[a],_o);
        }

    }//end of method initInfo


    public void setIsFieldGet(Object _o,boolean b){
        initInfo(_o);
        for(int i=0;i<m_isGetFields.length;i++)
        try{m_isGetFields[i].setBoolean(_o,b);}catch(Exception e){System.out.println(e);}
    }

    public void setIsFieldSet(Object _o,boolean b){
        initInfo(_o);
        for(int i=0;i<m_isSetFields.length;i++)
        try{m_isSetFields[i].setBoolean(_o,b);}catch(Exception e){System.out.println(e);}
    }


    public static String getStringValueOfField(Field _f, Object _o){

        String s="";
        Class c=_f.getType();
        try{
            if(c.getName().equals("int")) s=s+_f.getInt(_o);
            if(c.getName().equals("double")) s=s+_f.getDouble(_o);
            if(c.getName().equals("java.lang.String"))s=s+_f.get(_o);

        }catch(Exception e){}
        return s;
    }



    public String[] getFieldValues(){
        return m_fieldValues;
    }

    public Field[] getFields(){
        return m_fields;
    }

    public Field[]  getIsSetFields(){
        return m_isSetFields;
    }

}//end of class Translater
