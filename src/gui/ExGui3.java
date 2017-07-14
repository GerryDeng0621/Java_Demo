/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package gui;
 import java.awt.*;

 public class ExGui3 {

    private Frame f;
    private Panel p;
    private Button bw, bc;
    private Button bfile, bhelp;

 public static void main(String args[]) {
     ExGui3 gui = new ExGui3();
     gui.go();
 }
 public void go() {
     f = new Frame("GUI example 3");
     bw = new Button("West");
     bc = new Button("Work space region");
     f.add(bw, BorderLayout.WEST );
     f.add(bc, BorderLayout.CENTER );
     p = new Panel();
     bfile = new Button("File");
     bhelp = new Button("Help");
     p.add(bfile);
     p.add(bhelp);
     f.add(p, BorderLayout.NORTH );
     f.pack();
     f.setVisible(true);
 }
 }
