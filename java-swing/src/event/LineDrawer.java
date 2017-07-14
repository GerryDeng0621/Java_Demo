package event;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class LineDrawer extends Frame {
  private List<List<Point>> lines=new ArrayList<List<Point>>();  //存放所有的线条
  private List<Point> currLine; //当前线条

  public LineDrawer(String title){
    super(title);
 //   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    addMouseListener(new MouseAdapter(){
      //当用户按下鼠标，就开始绘制一条新的线条
      public void mousePressed(MouseEvent event){
        currLine=new ArrayList<Point>();
        lines.add(currLine);
        currLine.add(new Point(event.getX(),event.getY()));
      }
    });
   

    addMouseMotionListener(new MouseMotionAdapter(){
      //拖动鼠标时，随之画线条
      public void mouseDragged(MouseEvent event){
        currLine.add(new Point(event.getX(),event.getY()));
        repaint();
      }
    });
     this.addWindowListener(new WindowAdapter()
     {public void windowClosing(WindowEvent evt)
     {System.exit(0);
    	 
     }}
     
     );
    setSize(300,300);
    setVisible(true);
  }
  public void update(Graphics g){
     paint(g);
  }

  public void paint(Graphics g){
     Iterator<List<Point>> linesIterator=lines.iterator();
     while(linesIterator.hasNext()){
       Iterator<Point> points=linesIterator.next().iterator();
       int x1=-1,y1=-1,x2=-1,y2=-1;
       while(points.hasNext()){
         Point point=points.next();
         x2=(int)point.getX();
         y2=(int)point.getY();
         if(x1!=-1)
           g.drawLine(x1,y1,x2,y2);
         x1=x2;
         y1=y2;
       }
     }
  }
  public static void main(String args[]){
    new LineDrawer("hello");
  }
}


/****************************************************
 * 作者：孙卫琴                                     *
 * 来源：<<Java面向对象编程>>                       *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
