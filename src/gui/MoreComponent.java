/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package gui;

import java.awt.*;

public class MoreComponent extends Frame {

	    public static void main(String args[]) {
	        new MoreComponent().go();
             }

	    public void go() {

	        setLayout(new FlowLayout(FlowLayout.LEFT));
	        Panel p1 = new Panel();
	        add(p1);
	        p1.add(new Label("Your name: "));
	        p1.add(new TextField(30));
	        Panel p2 = new Panel();
	        add(p2);
	        p2.add(new Label("Sex: "));
	        CheckboxGroup cbg = new CheckboxGroup();
	        p2.add(new Checkbox("Male ", cbg, true));
	        p2.add(new Checkbox("Female ", cbg, false));
	        Panel p3 = new Panel();
	        add(p3);
	        p3.add(new Label("What are you like: "));
	        p3.add(new Checkbox("Apple "));
	        p3.add(new Checkbox("orange "));
	        p3.add(new Checkbox("Strawberry "));
	        p3.add(new Checkbox("Peach "));
	        Panel p4 = new Panel();
                add(p4);
	        p4.add(new Label("How much do you eat them per week: "));
	        Choice c = new Choice();
	        c.addItem("less than 1kg ");
	        c.addItem("1kg to 3kg");
	        c.addItem("more than 3kg");
	        p4.add(c);
	        Panel p5 = new Panel();
	        add(p5);
	        p5.add(new Label("What's your opnion of eating fruit: "));
	        add(new TextArea("I think ",3,60));
	        Panel p6 = new Panel();
                add(p6);
	        p6.add(new Button("  OK  "));
	        p6.add(new Button("Clear "));

                setSize(400,400);
                setVisible(true);
	    }
	}



