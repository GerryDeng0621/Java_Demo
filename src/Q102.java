/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

    import java.awt.*;
    import java.awt.event.*;
    
    import java.applet.*;
     
    public class Q102 extends Applet  implements ActionListener{
       Button stop, go;
       public void init( ) {
       stop = new Button("stop");
       go = new Button("go");
	     stop.addActionListener(this);
		 go.addActionListener(this);
       add(stop);
       add(go);
       }
       public void actionPerformed(ActionEvent e) {
          if ((Button)e.getSource() == stop) {
            	   stop.setEnabled(false );
           	   go. setEnabled(true );
           } else {
              stop. setEnabled(true );
              go. setEnabled(false );
          }
       }

   public static void main(String args[]){
Frame f=new Frame();
Q102 s=new Q102();
s.init();
f.add(s);
f.setSize(300,300);
f.setVisible(true);
       }
    }
     
