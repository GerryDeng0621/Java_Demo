/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package gui;
import java.awt.*;
import java.awt.event.*;
public class EventTester5 extends Frame {
  Button b;
  public EventTester5 (String title){
    super(title);
    setLayout(new FlowLayout());
    b=new Button("Mouse 1");
    b.addMouseListener(new MyMouseListener1(1)); //register MyMouseListener
    b.addActionListener(new MyActionListener(1)); //register MyActionListener
    add(b);
    setSize(300,300);
    setBackground(Color.blue);
    setVisible(true);
  }
  public static void main(String args[]){
    EventTester5 f=new EventTester5("hello");
  }
}
class MyMouseListener1 extends MouseAdapter{
  int count;
  public MyMouseListener1(int count){this.count=count;}
  public void mousePressed(MouseEvent evt){
    Button b=(Button)evt.getSource(); //get event source
    b.setLabel("Mouse "+new Integer(++count).toString());
  }
}
class MyActionListener implements ActionListener{
  int count;
  public MyActionListener(int count){this.count=count;}
  public void actionPerformed(ActionEvent evt){
    Button b=(Button)evt.getSource(); //get event source
    Frame f=(Frame)b.getParent(); //get the container of the button
    f.setTitle("Action "+new Integer(++count).toString());
  }
}
