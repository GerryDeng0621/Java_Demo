/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package gui;
import java.awt.*;
import javax.swing.*;
import java.applet.Applet;
public class KeyBoardGui
{
public static void main(String args[])
{
Frame framePad=new Frame("NumberPad");
framePad.setLayout(new BorderLayout());
JPanel panelTop=new JPanel();
panelTop.setLayout(new GridLayout(1,4,5,10));
panelTop.add(new JButton("Lock"));
panelTop.add(new JButton("/"));
panelTop.add(new JButton("*"));
panelTop.add(new JButton("-"));
framePad.add(panelTop,BorderLayout.NORTH);
JPanel panelMid=new JPanel();
panelMid.setLayout(new GridLayout(3,3,10,5));
for(int x=1;x<=9;x++)
panelMid.add(new JButton(String.valueOf(x)));
JPanel panelBot=new JPanel();
panelBot.setLayout(new BorderLayout());
panelBot.add(new JButton("0"),BorderLayout.CENTER);
panelBot.add(new JButton("."),BorderLayout.EAST);
JPanel panelNum=new JPanel();
panelNum.setLayout(new BorderLayout());
panelNum.add(panelMid,BorderLayout.CENTER);
panelNum.add(panelBot,BorderLayout.SOUTH);
framePad.add(panelNum,BorderLayout.CENTER);
JPanel panelRight=new JPanel();
panelRight.setLayout(new GridLayout(2,1,10,5));
panelRight.add(new JButton("+"));
panelRight.add(new JButton(" "));
framePad.add(panelRight,BorderLayout.EAST);
framePad.pack();
framePad.show();
}
}
