/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package gui;
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
public class GridBagSample
{
public static void main(String args[])
{
JPanel panel1=new JPanel();
panel1.setLayout(new GridBagLayout());
GridBagConstraints gbdc=new GridBagConstraints();
gbdc.fill=GridBagConstraints.BOTH;
gbdc.weightx=1;
gbdc.weighty=1;
//gbdc.weightx=0;
//gbdc.weighty=0;
panel1.add(new JButton("No.1"),gbdc);
panel1.add(new JButton("No.2"),gbdc);
panel1.add(new JButton("No.3"),gbdc);
gbdc.gridwidth=2;
gbdc.gridx=0;
panel1.add(new JButton("No.4"),gbdc);
gbdc.gridx=2;
gbdc.gridwidth=1;
gbdc.gridheight=2;
panel1.add(new JButton("No.5"),gbdc);
gbdc.gridx=0;
gbdc.gridheight=1;
panel1.add(new JButton("No.6"),gbdc);
gbdc.gridx=1;
panel1.add(new JButton("No.7"),gbdc);
gbdc.gridx=0;
gbdc.gridwidth=2;
panel1.add(new JButton("No.8"),gbdc);
gbdc.gridx=2;
gbdc.gridwidth=1;
panel1.add(new JButton("No.9"),gbdc);

Frame framePad=new Frame("GUI");
framePad.setLayout(new BorderLayout());
framePad.add(panel1);
framePad.setSize(300,300);
framePad.setVisible(true);
}
}
