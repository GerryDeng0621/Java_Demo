/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/


package gui;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.net.*;


public class AppletShower extends Frame{

    MyApplet1 m;
    Panel p;
    Button b;
    boolean flag=false;

    public void go(){

        m=new MyApplet1();
        m.setBackground(Color.red);
        add(m,"Center");

        p=new Panel();
        b=new Button("stop");
        p.add(b);
        add(p,"North");

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(flag) {m.start();flag=false;b.setLabel("stop");}else{m.stop();flag=true;b.setLabel("start");}
        }});

        setSize(300,300);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
	   public void windowClosing(WindowEvent evt){


             System.exit(0);
	}});
        m.init();
        m.start();

    }

    public static void main(String args[]){
        new AppletShower().go();
    }

}

class MyApplet1 extends Applet implements Runnable {
   String word;          // a string for display
   int fontSize;	//font size for display
   Thread changer;	//it will change the fontSize dynamically
   boolean stopFlag=false;

   public void init() {
       	word="hello";
        fontSize=0;

   }

   public void start(){
      changer=new Thread(this);
      stopFlag=false;
      changer.start();
   }


   public void paint(Graphics g) {
     g.setFont(new Font("newFont",Font.BOLD,fontSize));
     g.drawString(word,30,80);
   }

   public void stop(){
     stopFlag=true;
   }

   public void run(){

    while(!stopFlag){

        fontSize+=4;
        repaint(); //The word will be redrawed with new fontSize
        try{
	        Thread.sleep(500);
        }catch(Exception e){}
        if(fontSize>50) fontSize=8;
        }

        fontSize=0;
        repaint();

   }//run()


}
