/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package gui;
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
public class TestCombination
{
public static void main(String args[])
{
Frame frame1=new Frame("testCombination1");
frame1.setLayout(new BorderLayout());
TextArea text1=new TextArea();
frame1.add(text1,BorderLayout.CENTER);
JPanel panel1=new JPanel();
panel1.setLayout(new GridLayout(1,3,10,5));
panel1.add(new JButton("A"));
panel1.add(new JButton("B"));
panel1.add(new JButton("C"));
frame1.add(panel1,BorderLayout.SOUTH);
frame1.pack();
frame1.show();
}
}
