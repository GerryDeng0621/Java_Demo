import javax.swing.*;
import static javax.swing.JFrame.*; //引入JFrame的静态常量
public class JframeDemo {
    public static void main(String args[]) {
       JFrame window2=new JFrame("退出程序");
       window2.setBounds(260,100,188,108);
       window2.setVisible(true);
       window2.setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }
}
