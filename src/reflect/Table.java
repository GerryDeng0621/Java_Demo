/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
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

    //唯一标识
    public int id;
    public boolean isIdGet;
    public boolean isIdSet;

    //日期
    public String  date="";
    public boolean isDateGet;
    public boolean isDateSet;

    //删除标记
    public String deleteFlag="";
    public boolean isDeleteFlagGet;
    public boolean isDeleteFlagSet;
}//end of Table
