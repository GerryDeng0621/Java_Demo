/****************************************************
 * �ο��鼮��<<Java���������>>                   *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
package reflect;
public class Table{

    public Table(){
    }

    public Table(boolean isGet,boolean isSet)
    {
        Translater t=new Translater();
        t.setIsFieldGet(this,isGet);
        t.setIsFieldSet(this,isSet);
    }

    //Ψһ��ʶ
    public int id;
    public boolean isIdGet;
    public boolean isIdSet;

    //����
    public String  date="";
    public boolean isDateGet;
    public boolean isDateSet;

    //ɾ�����
    public String deleteFlag="";
    public boolean isDeleteFlagGet;
    public boolean isDeleteFlagSet;
}//end of Table
