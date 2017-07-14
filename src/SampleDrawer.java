/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
import java.awt.*;
import java.awt.event.*;
public class SampleDrawer extends Frame implements ActionListener{
Color color=Color.red;
Button b;
public SampleDrawer(String title){
super(title);
setLayout(new FlowLayout());
b=new Button("Change Color");
b.addActionListener(this); 
add(b);
setSize(300,300);
setVisible(true);
}
public void paint(Graphics g){
g.setColor(color);
g.fillRect(100,100,100,100);
g.setColor(Color.black);
//g.fillRect(0,0,300,100);
g.fillRect(0,100,100,100);
g.fillRect(200,100,100,100);
g.fillRect(0,200,300,100);
}
public static void main(String args[]){
SampleDrawer f=new SampleDrawer("hello");
}
public void actionPerformed(ActionEvent evt){
if(color==Color.red)
color=Color.green;
else
color=Color.red;
repaint(); //call repaint() method
}
}

