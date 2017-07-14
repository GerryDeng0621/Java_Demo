package event;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
public class OuterCounter extends JFrame{
  private Button button=new Button("1");

  public OuterCounter(String title){
    super(title);
    //把MyListener的实例注册为Button的监听器
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
  private int step;  //决定Button上的标号每次增加的步长
  public MyListener(int step){this.step=step;}

  /** 实现ActionListener的actionPerformed()方法 */
  public void actionPerformed(ActionEvent evt){
     Button button=(Button)evt.getSource();  //获得事件源
     int count=Integer.parseInt(button.getLabel());
     button.setLabel(new Integer(step+count).toString());  //把Button上的标号加step
  }
}


/****************************************************
 * 作者：孙卫琴                                     *
 * 来源：<<Java面向对象编程>>                       *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
