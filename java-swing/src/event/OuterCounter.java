package event;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
public class OuterCounter extends JFrame{
  private Button button=new Button("1");

  public OuterCounter(String title){
    super(title);
    //��MyListener��ʵ��ע��ΪButton�ļ�����
    button.addActionListener(new MyListener(1));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(button);
    setSize(100,100);
    setVisible(true);
  }

  public static void main(String args[]){
    new OuterCounter("hello");
  }
}

class MyListener implements ActionListener{
  private int step;  //����Button�ϵı��ÿ�����ӵĲ���
  public MyListener(int step){this.step=step;}

  /** ʵ��ActionListener��actionPerformed()���� */
  public void actionPerformed(ActionEvent evt){
     Button button=(Button)evt.getSource();  //����¼�Դ
     int count=Integer.parseInt(button.getLabel());
     button.setLabel(new Integer(step+count).toString());  //��Button�ϵı�ż�step
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
