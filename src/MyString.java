/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/


/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:
 * @author
 * @version 1.0
 */

public class MyString {
  private char[] cs;

  public MyString() {
  }

  public MyString(char[] s){
    cs=s;

  }

  public MyString(String s){
    cs=s.toCharArray();

  }
  public String toString(){

     return new String(cs);
  }


  public boolean equals(Object o){
     if(!(o instanceof MyString))return false;

     MyString ms=(MyString)o;
     if(this.toString().equals(ms.toString()))return true;
     else return false;

  }


  public MyString concat(MyString s){
    return new MyString(s.toString());
  }


  public static void main(String args[]){
    MyString m=new MyString("abc");
     MyString m1=m.concat(new MyString("def"));
    System.out.println(m.equals(m1));

  }


}




