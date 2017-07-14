/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package gui;
 import java.awt.*;
 import java.awt.event.*;
 import java.util.*;
 
 public class Calculater {

    private Frame frame;
    private Panel panel;
    private TextField tf; 	
    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bAdd,bDel,bMul,bDiv,bClear,bEqual;

    Vector v=new Vector();//用来放表达式
      
    public static void main(String args[]) { 
        Calculater gui = new Calculater(); 
        gui.go(); 
    } 

    public void go() { 
             
        //set frame
        frame = new Frame("Calculater");
        panel = new Panel();
        tf=new TextField();
        tf.setBackground(Color.blue); 	
        frame.add(tf,BorderLayout.NORTH ); 	
        frame.add(panel,BorderLayout.CENTER ); 				 
             
        //set panel
        b0=new Button("0");		
        b1=new Button("1");	
        b2=new Button("2");	
        b3=new Button("3");	
        b4=new Button("4");	
        b5=new Button("5");	
        b6=new Button("6");	
        b7=new Button("7");	
        b8=new Button("8");	
        b9=new Button("9");	
        bAdd=new Button("+");	
        bDel=new Button("-");	
        bMul=new Button("*");	
        bDiv=new Button("/");	
        bClear=new Button("C");	
        bEqual=new Button("=");	
             
        panel.setLayout(new GridLayout(4,4));
        panel.add(b7);	   
        panel.add(b8);	
        panel.add(b9);	
        panel.add(bAdd);	
        panel.add(b4);	
        panel.add(b5);	
        panel.add(b6);	
        panel.add(bDel);	
        panel.add(b1);	
        panel.add(b2);	
        panel.add(b3);	
        panel.add(bMul);	
        panel.add(b0);	
        panel.add(bClear);	
        panel.add(bEqual);	
        panel.add(bDiv);	


        MyActionListener ma=new MyActionListener();
        MyWindowListener mw=new MyWindowListener();
             
        b0.addActionListener(ma);   
        b1.addActionListener(ma);   
        b2.addActionListener(ma);   
        b3.addActionListener(ma);   
        b4.addActionListener(ma);   
        b5.addActionListener(ma);   
        b6.addActionListener(ma);   
        b7.addActionListener(ma);   
        b8.addActionListener(ma);   
        b9.addActionListener(ma);   
        bAdd.addActionListener(ma);   
        bDel.addActionListener(ma);   
        bMul.addActionListener(ma);   
        bDiv.addActionListener(ma);   
        bEqual.addActionListener(ma);   
        bClear.addActionListener(ma);   
             
        frame.addWindowListener(mw);
             
        frame.setSize(300,300);
        frame.setVisible(true); 
    }
         
    //inner class
    class MyWindowListener extends WindowAdapter{
        public void windowClosing(WindowEvent evt){
            
            System.exit(0);
        }
    }   
    
    //inner class     
    class MyActionListener implements ActionListener{
        
        public void actionPerformed(ActionEvent evt){
            
            Button b=(Button)evt.getSource();
            if(b==bEqual)calculateVector();
            else 
            if(b==bClear)clearVector();
            else{
                    String element=b.getLabel();
                    String elementLast=null;
                    if(v.size()!=0){
                        elementLast=(String)v.elementAt(v.size()-1);
                        if(isNum(element) && !isNum(elementLast) || isNum(elementLast)){
                            v.addElement(element);
                            printVector();
                        }
                    }else{
                        if(isNum(element)){
                            v.addElement(element);
                            printVector();
                        }
                    }
            }
        }
            
        public void printVector(){
            String s="";
            for(int i=0;i<v.size();i++){
                s=s+(String)v.elementAt(i);
            }
            tf.setText(s);
        }
        public boolean isNum(String s){
            boolean b;
            try{
                Integer.parseInt(s);
                return true;
            }catch(Exception e){return false;}
                
        }
        
        public void calculateVector(){
            
            if(v.size()==0) return;
            
            //过滤表达式，将多个数字合并为一个整数，放入新的堆栈vv中
            //如果在堆栈v中为{"1","2","+","1","*","2"}
            //则堆栈vv中内容为{"12","+","1","*","2"}
            
            Vector vv=new Vector();
            int index=0;
            while(index<v.size()){
                int num=0;
                while(index<v.size() && isNum((String)v.elementAt(index))){
                    num=num*10+Integer.parseInt((String)v.elementAt(index));
                    index++;
                }
                vv.addElement(new Integer(num).toString());
                if(index<v.size()&& index!=v.size()-1)vv.addElement(v.elementAt(index));
                
                index++;
            
            }
            
            int result=0;
            if(vv.size()<3)result=Integer.parseInt((String)vv.elementAt(0));
            else             
                result=calculateVector(vv);
                     
            
            tf.setText(new Integer(result).toString());
            v.removeAllElements();
            v.addElement(tf.getText());
                
                
        }
        
        //采用递归计算表达式
        
        public int calculateVector(Vector vv){
            
            String num1=(String)vv.elementAt(0);
            String opt=(String)vv.elementAt(1);
            String num2=(String)vv.elementAt(2);
            
            if(vv.size()==3)return calculate(num1,opt,num2);
            if(opt.equals("*") || opt.equals("/")){
                // 对于表达式1*2+12-2， 先计算1*2＝2, 再计算表达式2＋12－2
                int result=calculate(num1,opt,num2);
                vv.removeElementAt(0);
                vv.removeElementAt(0);
                vv.removeElementAt(0);
                
                vv.insertElementAt(new Integer(result).toString(),0);
                
                return calculateVector(vv);
            }else{
                // 对于表达式12+1*2-3， 先计算1*2-3＝－1，再计算表达式12＋（－1）＝11
                vv.removeElementAt(0);
                vv.removeElementAt(0);
                num2=new Integer(calculateVector(vv)).toString();
                return calculate(num1, opt, num2); 
            }
        
        }
        
        
        public int calculate(String num1, String opt,String num2){
            int result=Integer.parseInt(num1);
            if(opt.equals("+"))result=result+Integer.parseInt(num2);
            if(opt.equals("-"))result=result-Integer.parseInt(num2);
            if(opt.equals("*"))result=result*Integer.parseInt(num2);
            if(opt.equals("/"))result=result/Integer.parseInt(num2);
            
            return result;
                 
        }
        
        public void clearVector(){
            v.removeAllElements();
            tf.setText(null);
        }
    }
 
 }
