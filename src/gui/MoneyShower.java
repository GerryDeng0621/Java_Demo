/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package gui;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.net.*;


public class MoneyShower extends Frame{
    MyPanel m;
    Panel p;
    Button b;
    boolean flag=false;

    public MoneyShower(String name){super(name);}

    public void go(){
        m=new MyPanel();
        add(m,"Center");

        p=new Panel();
        p.setBackground(Color.orange);
        b=new Button("  够啦！ ");
        p.add(b);
        add(p,"North");

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(flag) {
                   m.start();
                   flag=false;
                   b.setLabel("  够啦！ ");
                 }else{
                    m.stop();
                    flag=true;
                    b.setLabel(" 开始取款 ");
                 }
        }});

        setSize(300,300);
        setVisible(true);

        addWindowListener(new WindowAdapter(){
	   public void windowClosing(WindowEvent evt){
             System.exit(0);
	}});

        m.start();

    }

    public static void main(String args[]){
        new MoneyShower("ATM").go();
    }

}

class MyPanel extends Panel implements Runnable {

   int index;	//index of image for display
   Thread changer;	//it will change the image dynamically
   boolean stopFlag=false;
   Image[] images;
   Image mouth;
   //URL
   public MyPanel() {
       	Toolkit tk=getToolkit();
       	images=new Image[4];


        images[0]=tk.getImage("C:\\java_base\\examples\\src\\gui\\money1.jpg");
        images[1]=tk.getImage("C:\\java_base\\examples\\src\\gui\\money2.jpg");
   	images[2]=tk.getImage("C:\\java_base\\examples\\src\\gui\\money3.jpg");
   	images[3]=tk.getImage("C:\\java_base\\examples\\src\\gui\\money4.jpg");
       	mouth=tk.getImage("C:\\java_base\\examples\\src\\gui\\mouth.jpg");

   }

   public void start(){
      changer=new Thread(this);
      stopFlag=false;
      index=0;
      changer.start();
   }


   public void paint(Graphics g) {
      g.drawImage(mouth,100,45,this);
      synchronized(this){if(index<4)g.drawImage(images[index],107,50,this);}
    }

   public void stop(){
     stopFlag=true;
   }

   public void run(){

    while(!stopFlag){

        repaint(); //The word will be redrawed with new fontSize
        try{
	        Thread.sleep(500);
        }catch(Exception e){}

        synchronized(this){
            index++;
            if(index>4) index=0;
        }

    }

    synchronized(this){index=4;}
    repaint();

}//run()


}
