/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/


import java.sql.Connection;
import java.sql.Statement;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Types;
import java.sql.PreparedStatement;
import java.util.Vector;

import java.io.*;

public class DBService
{

    Connection conn;
    String DBurl;
    String user;
    String pwd;


    public DBService(String user, String pwd){
        this("jdbc:odbc:studentDB",user, pwd);
    }
    public DBService(String DBurl, String user, String pwd){

        this.DBurl=DBurl;
        this.user=user;
        this.pwd=pwd;
        try {


            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");            
            conn = java.sql.DriverManager.getConnection(DBurl,user,pwd);
            conn.setAutoCommit(false);


        } catch(Exception e) {
            e.printStackTrace();
         
        }

    }


    /** check the connection, then return a new created statement.
     * NOTE: MIGHT RETURN NULL
     */
    synchronized public Statement getStatement()
    {
        try {
            if(conn.isClosed()) {
                try	{
                    conn.close();
                } catch (Exception e )	{e.printStackTrace(); }

                conn = java.sql.DriverManager.getConnection(DBurl,user,pwd);
                conn.setAutoCommit(false);
            }

            Statement stmt = conn.createStatement();
            return stmt;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean updateTable( String sql)
    {
        try {
            Statement stmt=getStatement();
            stmt.executeUpdate(sql);
            commit();
            stmt.close();
            return true;
        } catch(Exception e) {
           try{
                e.printStackTrace();
            	conn.rollback();
            }catch(Exception ee){
               ee.printStackTrace();
            }
            return false;
        }
    }

    public boolean insertTable(String sql)
    {
        try {
            Statement stmt=getStatement();
            stmt.executeUpdate(sql);
            
            commit();
            stmt.close();
            return true;
        } catch(Exception e) {
            e.printStackTrace();
            try{

            	conn.rollback();
            }catch(Exception ee){
            	ee.printStackTrace();
            }
            return false;
        }
    }

  
    public boolean deleteTable( String sql)
    {
        try {
            Statement stmt=getStatement();
            stmt.executeUpdate(sql);
            commit();
            stmt.close();
            return true;
        } catch(Exception e){
            e.printStackTrace();
            try{
            	conn.rollback();
            }catch(Exception ee){
            	ee.printStackTrace();
            }
            return false;
        }
    }


    /**
     * Commit the changes to database
     * @return: true - successfully
     *	        false - fail
     */
    public boolean commit(){
    	try{
    		conn.commit();
    	}catch(Exception e){
            e.printStackTrace();
            return false;
    	}
    	return true;
    }


    synchronized public CallableStatement getCallableStatement(String sql)
    {
        try {
            if(conn.isClosed()) {
                try	{
                    conn.close();
                } catch (Exception e )	{
                e.printStackTrace();
                }

                conn = java.sql.DriverManager.getConnection(DBurl,user,pwd);

            }

            CallableStatement stmt = conn.prepareCall(sql);
            return stmt;
        } catch(Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Vector selectStudent(String name){
        String sql="select * from student where name="+"'"+name+"'";
        System.out.println(sql);
        Vector v=new Vector();
        try{
            Statement stmt=getStatement();
            ResultSet rs=stmt.executeQuery(sql);
            System.out.println(rs);    
            while(rs.next()){
                Student s=new Student();
                s.name=rs.getString(1);
                 s.gender=rs.getString(2);
                s.age=rs.getInt(3);
                s.score=rs.getInt(4);
               
                v.addElement(s);
                
            }
            rs.close();
            stmt.close();
        }catch(Exception e){e.printStackTrace();}
    
        return v;
        
    }

    public static void main(String args[]){
        DBService ds=new DBService("jdbc:odbc:studentDB","sa","");
        
        //insert into Student
        String sql="insert into Student(name,age,gender) values('Linda',15,'f')";
        ds.insertTable(sql);
           
            //select from Student
            Vector v=ds.selectStudent("Linda");
            System.out.println("There are "+v.size()+ " students named " + "Linda");         

/*
//update from Student
sql="update Student set age=" + 16 +" where name="+"'"+"Linda"+"'";  
System.out.println("updatesql="+sql);
			ds.updateTable(sql);    
            
//delete from Student 
			sql="delete from Student where name="+"'"+"Linda"+"'";  
			ds.deleteTable(sql);      
          
*/
        
    }

}


class Student{
    public String name;
    public String gender;
    public int age;
    public int score;
    
    
}


