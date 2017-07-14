/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package gui;
import java.awt.*;
import java.awt.event.*;
public class EventTester2 extends Frame implements ActionListener{
  int count=1;
  Button b;
  public EventTester2(String title){
    super(title);
    setLayout(new FlowLayout());
    b=new Button("1");
    b.addActionListener(this); //Sample itself is an ActionListener
    add(b);
    setSize(100,100);
    setBackground(Color.blue);
    setVisible(true);
  }
  public static void main(String args[]){
    EventTester2 f=new EventTester2 ("hello");
  }
  public void actionPerformed(ActionEvent evt){
    b.setLabel(new Integer(++count).toString());
  }
}
