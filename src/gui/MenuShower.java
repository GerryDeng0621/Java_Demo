/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package gui;
import java.awt.*;
import java.awt.event.*;
public class MenuShower implements ActionListener{

public static void main(String args[]){
new MenuShower().go();
}
public  void go(){

Frame f=new Frame("MenuBar");
MenuBar mb = new MenuBar();
f.setMenuBar(mb);
Menu m1 = new Menu("File");
Menu m2 = new Menu("Edit");
Menu m3 = new Menu("Help");
mb.add(m1);
mb.add(m2);
mb.setHelpMenu(m3);

MenuItem mi1 = new MenuItem("New");
MenuItem mi2 = new MenuItem("Load");
MenuItem mi3 = new MenuItem ("Save");
MenuItem mi4 = new MenuItem("Quit");
mi1.addActionListener(this);
mi2.addActionListener(this);
mi3.addActionListener(this);
m1.add(mi1);
m1.add(mi2);
m1.addSeparator();
m1.add(mi3);
m1.add(mi4);

f.setSize(500,500);
f.setVisible(true);
}

public void actionPerformed(ActionEvent e){

   System.out.println("choose one menu");
}
}
