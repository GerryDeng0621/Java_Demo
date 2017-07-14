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
    //�����˴��ڵĴ�С�����ʺ������������ѡ��С�Ͳ��֡�
    pack();
    setVisible(true);
  }
  public static void main(String args[]) {
    new CalculaterGUI("Calculater");
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
