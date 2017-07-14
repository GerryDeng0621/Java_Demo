/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package gui;
import java.awt.*;
import java.awt.event.*; 
import java.util.*; 
public class MyCanvas extends Canvas 
implements KeyListener { 
int index; 
Color colors[] = {Color.red, Color.green, Color.blue }; 
public void paint(Graphics g) { 
g.setColor(colors[index]); 
g.fillOval(0,0,getSize().width,getSize().height); 
} 
public static void main(String args[]){ 
Frame f = new Frame("Canvas"); 
MyCanvas mc = new MyCanvas(); 
f.add(mc,BorderLayout.CENTER); 
f.setSize(150, 150); 
mc.requestFocus(); 
mc.addKeyListener(mc); 
f.setVisible(true); 
} 
public void keyTyped(KeyEvent ev){ 
index++; 
if (index == colors.length){ 
index =0; 
} 
repaint(); 
} 
public void keyPressed(KeyEvent ev){ 
} 
public void keyReleased(KeyEvent ev){ 
} 
}
