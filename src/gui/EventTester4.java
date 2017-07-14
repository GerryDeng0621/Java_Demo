/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package gui;
import java.awt.*;
import java.awt.event.*;
public class EventTester4 extends Frame {
  Button b;
  public EventTester4 (String title){
    super(title);
    setLayout(new FlowLayout());
    b=new Button("1");
    b.addMouseListener(new MyMouseListener(1)); //register MyListener
    add(b);
    setSize(100,100);
    setBackground(Color.blue);
    setVisible(true);
  }
  public static void main(String args[]){
    EventTester4 f=new EventTester4 ("hello");
  }
}
class MyMouseListener extends MouseAdapter{ // MyListener extends MouseAdapter
  int count;
  public MyMouseListener(int count){this.count=count;}
  public void mousePressed(MouseEvent evt){
    Button b=(Button)evt.getSource(); //get event source
    b.setLabel(new Integer(++count).toString());
  }
}


class MyMouseListenerTemp extends MouseAdapter{
int count;
public MyMouseListenerTemp(int count){this.count=count;}
public void mousePressed(MouseEvent evt){
Button b=(Button)evt.getSource(); //get event source
b.setLabel(new Integer(++count).toString());
}

public void mouseClicked(MouseEvent evt){

}
}
