package Layout;

import java.awt.*;
import java.awt.event.*;
public class lowLayoutDemo1{
  public static void main(String args[]){
    final Frame f=new Frame("hello");
    final FlowLayout fl=new FlowLayout();
    
    f.setLayout(fl);  //使Frame采用FlowLayout布局

    Button leftButton=new Button("left");
    Button leftButton2=new Button("left");
    Button leftButton3=new Button("left");
    Button leftButton4=new Button("left");
    Button leftButton5=new Button("left");
    Button leftButton6=new Button("left");
  
    
    f.add(leftButton);
    f.add(leftButton2);
    f.add(leftButton3);
    f.add(leftButton4);
    f.add(leftButton5);
    f.add(leftButton6);
   fl.setAlignment(fl.LEFT);
   fl.layoutContainer(f);
        f.setSize(200,100);
    f.setVisible(true);
  }
}


/****************************************************
 * 作者：孙卫琴                                     *
 * 来源：<<Java面向对象编程>>                       *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
