/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/


package gui;
import java.awt.*;
import java.awt.event.*;
public class CheckboxTester extends Frame implements ItemListener {
public CheckboxTester (String name){
super(name);

List l = new List(3, true);
l.add("One");
l.add("Two");
l.add("Three");
l.add("Four");
l.addItemListener(this);
add(l);
/*
Choice c = new Choice();
c.add("First");
c.add("Second");
c.add("Third");
c.addItemListener(this);

add(c);
*/
/*
CheckboxGroup cbg = new CheckboxGroup();
Checkbox one = new Checkbox("One", true,cbg);
Checkbox two = new Checkbox("Two", false,cbg);
Checkbox three = new Checkbox("Three", true,cbg);
*/
/*
Checkbox one = new Checkbox("One", true);
Checkbox two = new Checkbox("Two", false);
Checkbox three = new Checkbox("Three", true);

one.addItemListener(this);
two.addItemListener(this);
three.addItemListener(this);
add(one);
add(two);
add(three);
*/
setLayout(new FlowLayout());
setSize(300,300);
setVisible(true);
}
public static void main(String args[]){
CheckboxTester s=new CheckboxTester ("Sample");
}
public void itemStateChanged(ItemEvent ev) {
String state = "deselected";
if (ev.getStateChange() == ItemEvent.SELECTED){
state = "selected";
}
System.out.println(ev.getItem() + " " + state);
}
}
