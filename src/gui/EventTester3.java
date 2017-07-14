/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/


package gui;

import java.awt.*;
import java.awt.event.*;
public class EventTester3 extends Frame {
  Button b;
  Button b1;
  public EventTester3 (String title){
    super(title);
    setLayout(new FlowLayout());
    b=new Button("1");
    b.addActionListener(new MyListener(1)); //register MyListener
    add(b);
    b1=new Button("not registred");
    add(b1);
    setSize(100,100);
    setBackground(Color.blue);
    setVisible(true);
  }
  public static void main(String args[]){
    EventTester3 f=new EventTester3 ("hello");
  }
}
class MyListener implements ActionListener{
  int count;
  public MyListener(int count){this.count=count;}
  public void actionPerformed(ActionEvent evt){
    Button b=(Button)evt.getSource(); //get event source
    b.setLabel(new Integer(++count).toString());
  }
}
