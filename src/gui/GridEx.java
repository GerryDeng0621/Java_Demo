/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package gui;
 import java.awt.*;
 public class GridEx {
    private Frame f;
    private Button b1, b2, b3, b4, b5, b6;

    public static void main(String args[]) {
        GridEx grid = new GridEx();
        grid.go();
    }

    public void go() {
         f = new Frame("Grid example");

         f.setLayout (new GridLayout (3, 2));
         b1 = new Button("1");
         b2 = new Button("2");
         b3 = new Button("3");
         b4 = new Button("4");
         b5 = new Button("5");
         b6 = new Button("6");

         f.add(b1);
         f.add(b2);
         f.add(b3);
         f.add(b4);
         f.add(b5);
         f.add(b6);

         f.setSize(500,500);
         f.setVisible(true);
     }
 }
