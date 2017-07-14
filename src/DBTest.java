/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/


import java.sql.*;
import java.util.Vector;

import java.io.*;

public class DBTest
{

    Connection conn;
    String DBurl;
    String user;
    String pwd;

    public void test() throws Exception{
	 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        String dbUrl="jdbc:odbc:studentDB";
        String user="sa";
        String pwd="";
        Connection    conn = java.sql.DriverManager.getConnection(dbUrl,user,pwd);
        conn.setAutoCommit(true);

        Statement stmt = conn.createStatement();

        String sql="insert into student values('linda','f',16,90)";
        stmt.executeUpdate(sql);

        stmt.close();

        sql="insert into student values('tom','m',17,90)";
        stmt.executeUpdate(sql);


        sql="select * from student where name='linda'";
        try{

            ResultSet rs=stmt.executeQuery(sql);
            System.out.println(rs);
            while(rs.next()){
                Students s=new Students();
                s.name=rs.getString(1);
                s.gender=rs.getString(2);
                s.age=rs.getInt(3);
                s.score=rs.getInt(4);

               printStudent(s);

            }
            rs.close();
            stmt.close();
        }catch(Exception e){e.printStackTrace();}


    }

   public void printStudent(Students s){
      System.out.println("***begin to print student information***");
      System.out.println("name:"+s.name);
      System.out.println("gender:"+s.gender);
      System.out.println("age:"+s.age);
      System.out.println("score:"+s.score);
      System.out.println("***end of print student information***");
   }

    public static void main(String args[]) throws Exception{

    	new DBTest().test();

    }

}


class Students{
    public String name;
    public String gender;
    public int age;
    public int score;


}


