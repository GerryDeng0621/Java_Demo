package Layout;

import java.awt.*;

import javax.swing.JFrame;
public class CalculaterGUI extends JFrame {
  private Panel panel;
  private Label label;
  private String[] names={"7","8","9","+","4","5","6","-","1","2","3","*",
                          "0",".","=","/"};
  private Button[] buttons=new Button[16];

  public CalculaterGUI(String title) {
    super(title);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    label=new Label();
    panel = new Panel();
    panel.setLayout(new GridLayout(4,4));
    add(label,BorderLayout.NORTH );
    add(panel,BorderLayout.CENTER );

    for(int i=0;i<buttons.length;i++){
      buttons[i]=new Button(names[i]);
      panel.add(buttons[i]);
    }
    //调整此窗口的大小，以适合其子组件的首选大小和布局。
    pack();
    setVisible(true);
  }
  public static void main(String args[]) {
    new CalculaterGUI("Calculater");
  }
}


/****************************************************
 * 作者：孙卫琴                                     *
 * 来源：<<Java面向对象编程>>                       *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
