/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package gui;
import java.awt.*;
public class MyFrame extends Frame{
  Panel panel=new Panel();
  Button button=new Button("press me");

  public MyFrame(String title){
    super(title);
        
    panel.setLayout(null);
    panel.setSize(200,200);
    panel.setLocation(50,50);

    button.setSize(80,50);
    button.setLocation(80,80);
    panel.add(button);
    panel.setBackground(Color.yellow);

    setLayout(null);
    add(panel);
    setBackground(Color.blue);
    setSize(500,500);
    setVisible(true);
  }

  public static void main(String args[]){
    MyFrame f=new MyFrame("hello");
  }
}
