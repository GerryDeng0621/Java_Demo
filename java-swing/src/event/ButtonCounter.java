package event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
public class ButtonCounter extends JFrame{
  private Button button=new Button("1");
  Button button2=new Button("2");
  Button button3=new Button("3");
  public ButtonCounter(String title){
    super(title);
    //ΪButtonע��ActionEvent�ļ�����
    button.addActionListener(new ActionListener(){  //����һ���ڲ���
        public void actionPerformed(ActionEvent evt){
          int count=Integer.parseInt(button.getLabel());
          button.setLabel(new Integer(++count).toString());  //��Button�ı�ż�1
        }
      }
    );
  
    this.setLayout(new FlowLayout());
    add(button);
    add(button2);
    add(button3);
   
  setSize(300,300);
    setVisible(true);
  }
  public static void main(String args[]){
    new ButtonCounter("hello");
  }
}


/****************************************************
 * ���ߣ�������                                     *
 * ��Դ��<<Java���������>>                       *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
