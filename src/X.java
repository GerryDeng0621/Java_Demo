/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
import java.awt.*;
class X extends Frame{
X(){
//setLayout(new BorderLayout());
//setSize(600,600);
//Panel p=new Panel();
Button b1=new Button("Button1");
//Button b3=new Button("Button3West");
//Button b4=new Button("Button4East");
//b1.setBackground(Color.blue);
//p.add(b1);

Button b2=new Button("Button2");
//b2.setBackground(Color.yellow);
//b2.setForeground(Color.blue);
//add(p);
add(b1);
add(b2);
//add(p,BorderLayout.NORTH);
//add(b1,BorderLayout.NORTH);
//add(b2,BorderLayout.SOUTH);
//add(b3,BorderLayout.WEST);
//add(b4,BorderLayout.EAST);

setVisible(true);
}
public static void main(String args[]){
new X();
}
}
