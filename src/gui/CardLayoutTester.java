/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package gui;
import java.awt.*;
public class CardLayoutTester {
  public static void main(String args[]){
    Panel p1, p2, p3;
    Frame f = new Frame ("Card Test");
    CardLayout myCard = new CardLayout();
    f.setLayout(myCard);
    p1 = new Panel();
    p2 = new Panel();
    p3 = new Panel();

    f.setBackground(Color.white);
    p1.setBackground(Color.black);
    p2.setBackground(Color.blue);
    p3.setBackground(Color.red);

    f.add(p1, "First");
    f.add(p2, "Second");
    f.add(p3, "Third");

    myCard.show(f, "Second");

    f.setSize (200, 200);
    f.setVisible(true);
  }
}
