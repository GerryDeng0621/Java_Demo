/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package gui;
 import java.awt.*;
 
 public class ExGui4 {

    private Frame frame;
    private Panel panel;
    private Label label; 	
    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bDel,bMul,bDiv,bPoint,bEqual;

 
 public static void main(String args[]) { 
     ExGui4 gui = new ExGui4(); 
     gui.go(); 
 } 
 public void go() { 
     
     //set frame
     frame = new Frame("Calculater");
     panel = new Panel();
     label=new Label();
     label.setBackground(Color.blue); 	
     frame.add(label,BorderLayout.NORTH ); 	
     frame.add(panel,BorderLayout.CENTER ); 				 
     
     //set panel
     b0=new Button("0");		
     b1=new Button("1");	
     b2=new Button("2");	
     b3=new Button("3");	
     b4=new Button("4");	
     b5=new Button("5");	
     b6=new Button("6");	
     b7=new Button("7");	
     b8=new Button("8");	
     b9=new Button("9");	
     bAdd=new Button("+");	
     bDel=new Button("-");	
     bMul=new Button("*");	
     bDiv=new Button("/");	
     bPoint=new Button(".");	
     bEqual=new Button("=");	
     
     panel.setLayout(new GridLayout(4,4));
     panel.add(b7);	   
     panel.add(b8);	
     panel.add(b9);	
     panel.add(bAdd);	
     panel.add(b4);	
     panel.add(b5);	
     panel.add(b6);	
     panel.add(bDel);	
     panel.add(b1);	
     panel.add(b2);	
     panel.add(b3);	
     panel.add(bMul);	
     panel.add(b0);	
     panel.add(bPoint);	
     panel.add(bEqual);	
     panel.add(bDiv);	

     frame.pack();
     frame.setVisible(true); 
 }
 }
