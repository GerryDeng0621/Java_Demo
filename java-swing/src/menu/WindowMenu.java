package menu;

import javax.swing.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import static javax.swing.JFrame.*;
public class WindowMenu extends JFrame {
   JMenuBar menubar;
    JMenu menu,subMenu;
    JMenuItem  item1,item2;
    public WindowMenu(){} 
    public WindowMenu(String s,int x,int y,int w,int h) {
       init(s);
       setLocation(x,y);
       setSize(w,h);
       setVisible(true);
       setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
    }
    void init(String s){
       setTitle(s);        
       menubar=new JMenuBar(); 
       menu=new JMenu("�˵�"); 
       subMenu=new JMenu("�����Ŀ");  
        String dir="D:\\J2EE WORKSPACE\\java\\java-swing\\bin\\menu\\image\\";
       item1=new JMenuItem("Java����",new ImageIcon(dir+"a.gif"));
       item2=new JMenuItem("��������",new ImageIcon(dir+"b.gif"));
       item1.setAccelerator(KeyStroke.getKeyStroke('A')); 
       item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S,InputEvent.CTRL_MASK)); 
       menu.add(item1); 
       menu.addSeparator();
       menu.add(item2); 
       menu.add(subMenu);  
       subMenu.add(new JMenuItem("��������ϵͳ",new ImageIcon(dir+"c.gif"))); 
       subMenu.add(new JMenuItem("ũ����Ϣϵͳ",new ImageIcon(dir+"d.gif")));
       menubar.add(menu); 
       setJMenuBar(menubar);
    } 
}
