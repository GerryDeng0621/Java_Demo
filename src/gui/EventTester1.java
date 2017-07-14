/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package gui;
import java.awt.*;
import java.awt.event.*;
public class EventTester1 extends Frame{
  static int count=1;
  public EventTester1 (String title){super(title);}
  public static void main(String args[]){
    EventTester1 f=new EventTester1 ("hello");
    f.setLayout(new FlowLayout());
    final Button b=new Button("1");
    b.addActionListener(new ActionListener(){  //declare an Inner class
      public void actionPerformed(ActionEvent evt){
        b.setLabel(new Integer(++count).toString());
      }
    });

   f.add(b);
   f.setSize(100,100);
   f.setBackground(Color.blue);
   f.setVisible(true);
  }
}


