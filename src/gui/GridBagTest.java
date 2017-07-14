/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package gui;
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
public class GridBagTest
{
public static void main(String args[])
{
JPanel panel1=new JPanel();
panel1.setLayout(new GridBagLayout());
GridBagConstraints gbdc=new GridBagConstraints();

//gbdc.fill=GridBagConstraints.HORIZONTAL; //step3

gbdc.weightx=1;  //step1
panel1.add(new JButton("No.1"),gbdc);
gbdc.weightx=1; //step1
//gbdc.weightx=2; //step2
panel1.add(new JButton("No.2"),gbdc);


Frame framePad=new Frame("GUI");
framePad.setLayout(new BorderLayout());
framePad.add(panel1);
framePad.setSize(300,300);
framePad.setVisible(true);
}
}
