/****************************************************
 * �ο��鼮��<<Java���������>>                   *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
import java.awt.*; 
public class visual1 extends java.applet.Applet{ 
static Button b = new Button("TEST"); 

public void init(){ 
add(b); 
} 
public static void main(String args[]){ 
Frame f = new Frame("Visual"); 
f.setSize(300,300); 
f.setBackground(Color.red);
f.setForeground(Color.blue);b.setBackground(Color.yellow);

f.add(b); 
f.setVisible(true); 
}
}
