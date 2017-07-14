/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/


package gui;


import java.awt.*;
import java.awt.event.*;
public class DialogTest extends Frame implements KeyListener {
Dialog d;
Label l;
int index=1;
public DialogTest(String name){
super(name);
requestFocus();
addKeyListener(this);
d=new Dialog(this,"Note",true);
d.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent evt){
d.setVisible(false);
}
});
l=new Label();
d.add(l);
d.setSize(100,100);
setSize(300,300);
setVisible(true);
}
public static void main(String args[]){
DialogTest s=new DialogTest("Sample");
}
public void keyTyped(KeyEvent ev){
l.setText("keyTyped Count: " +index++);
d.setVisible(true);
}
public void keyPressed(KeyEvent ev){
}
public void keyReleased(KeyEvent ev){
}
}

