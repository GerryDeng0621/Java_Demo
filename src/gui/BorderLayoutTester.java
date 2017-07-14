/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package gui;
 import java.awt.*;

 public class BorderLayoutTester {
     private Frame f;
     private Button bn, bs, bw, be, bc;

     public static void main(String args[]) {
         BorderLayoutTester guiWindow2 = new BorderLayoutTester();
         guiWindow2.go();
  }

  public void go() {
      f = new Frame("Border Layout");
      //f.setLayout(new BorderLayout());
      bn = new Button("B1");
      bs = new Button("B2");
      be = new Button("B3");
      bw = new Button("B4");
      bc = new Button("B5");

      f.add(bn, BorderLayout.NORTH);
      f.add(bs, BorderLayout.SOUTH);
      f.add(be, BorderLayout.EAST);
      f.add(bw, BorderLayout.WEST);
      f.add(bc, BorderLayout.CENTER);

      f.add(new Button("hello"));

      f.pack();
      //f.setSize (500, 500);
      f.setVisible(true);
  }
 }
