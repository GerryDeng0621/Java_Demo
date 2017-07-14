/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package gui;



import java.applet.*;
import java.awt.*;


public class GridBagLayoutTest extends Frame
{

public static void main(String args[])

{

 new GridBagLayoutTest();

}
public void add(GridBagLayout gbl, Component c, GridBagConstraints gbc,

int x, int y, int w, int h)

{

gbc.gridx = x;

gbc.gridy = y;

gbc.gridwidth = w;

gbc.gridheight = h;

add(c);

gbl.setConstraints(c,gbc);

}




public GridBagLayoutTest()
{

//创建一个网格袋管理器

GridBagLayout gbl = new GridBagLayout();

setLayout(gbl);

//创建列表框，并向其中添加一些项

List style = new List(4,false);

style.addItem("Serif");

style.addItem("SansSerif");

style.addItem("Monospaced");

style.addItem("Dialog");

style.addItem("DialogInput");

//选择列表框的第一项

style.select(0);

//创建两个检查框

Checkbox bold = new Checkbox("Bold");

Checkbox italic = new Checkbox("Italic");

//创建一个提示标签和一个大小输入框

Label label = new Label("Size:");

TextField size = new TextField();

//创建一个样字显示框

TextField sample = new TextField();


//布置这些构件

//创建一个GridBagConstraints类的实例，构件设置布置信息

GridBagConstraints gbc = new GridBagConstraints();

//宽度和高度都不采用优选尺寸

gbc.fill = GridBagConstraints.BOTH;

gbc.weightx = 20;

gbc.weighty = 100;

//将列表框和相应的布置信息填入布置管理器

add(gbl, style,gbc,0,0,1,3);

gbc.weightx = 100;

//高度和宽度都采用优选尺寸

gbc.fill = GridBagConstraints.NONE;

gbc.anchor = GridBagConstraints.CENTER;

//下面这三个构件的布置信息相似

add(gbl, bold, gbc,1,0,2,1);

add(gbl, italic,gbc,1,1,2,1);

add(gbl, label,gbc,1,2,1,1);

//宽度采用单元宽度，高度采用优选尺寸

gbc.fill = GridBagConstraints.HORIZONTAL;

add(gbl, size,gbc,2,2,1,1);

//靠底部放置

gbc.anchor = GridBagConstraints.SOUTH;

//构件的高度不随容器尺寸的变化而变化

gbc.weighty = 0;

add(gbl, sample,gbc,0,3,4,1);

sample.setText("The quick view box.");

pack();
setVisible(true);
}

}
