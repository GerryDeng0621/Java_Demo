/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package gui;

import java.awt.*;
public class FrameShower{
  public static void main(String args[]){
    Frame f=new Frame("hello");
    f.add(new Button("Press Me"));
    f.setSize(100,100);
    f.setVisible(true);
  }

}
