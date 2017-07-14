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
    //为Button注册ActionEvent的监听器
    button.addActionListener(new ActionListener(){  //定义一个内部类
        public void actionPerformed(ActionEvent evt){
          int count=Integer.parseInt(button.getLabel());
          button.setLabel(new Integer(++count).toString());  //把Button的标号加1
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
 * 作者：孙卫琴                                     *
 * 来源：<<Java面向对象编程>>                       *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
