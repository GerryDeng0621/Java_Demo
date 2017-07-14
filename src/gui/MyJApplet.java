/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package gui;
import java.awt.*;
import java.applet.Applet;
import java.net.*;
import javax.swing.*;


public class MyJApplet extends JApplet implements Runnable {
  String word; // a string for display
  int fontSize;	//font size for display
  Thread changer;	//it will change the fontSize dynamically

  public void init() {
    word=getParameter("word");
    fontSize=8;
    setSize(100,100);
  }
  public void start(){
    changer=new Thread(this);
    changer.start();
  }
  public void stop(){
     changer.stop();
  }

  public void paint(Graphics g) {
     super.paint(g);
     g.setFont(new Font("newFont",Font.BOLD,fontSize));
     g.drawString(word,30,80);
  }
  public void run(){
    while(true){
    fontSize+=4;
    repaint(); //The word will be redrawed with new fontSize
    try{
	Thread.sleep(1000);
    }catch(Exception e){}
    if(fontSize>40) fontSize=8;
   }
  }//run()
}
