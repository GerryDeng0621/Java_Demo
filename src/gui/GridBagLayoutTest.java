/****************************************************
 * �ο��鼮��<<Java���������>>                   *
 * ����֧����ַ��www.javathinker.org                *
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

//����һ�������������

GridBagLayout gbl = new GridBagLayout();

setLayout(gbl);

//�����б�򣬲����������һЩ��

List style = new List(4,false);

style.addItem("Serif");

style.addItem("SansSerif");

style.addItem("Monospaced");

style.addItem("Dialog");

style.addItem("DialogInput");

//ѡ���б��ĵ�һ��

style.select(0);

//������������

Checkbox bold = new Checkbox("Bold");

Checkbox italic = new Checkbox("Italic");

//����һ����ʾ��ǩ��һ����С�����

Label label = new Label("Size:");

TextField size = new TextField();

//����һ��������ʾ��

TextField sample = new TextField();


//������Щ����

//����һ��GridBagConstraints���ʵ�����������ò�����Ϣ

GridBagConstraints gbc = new GridBagConstraints();

//��Ⱥ͸߶ȶ���������ѡ�ߴ�

gbc.fill = GridBagConstraints.BOTH;

gbc.weightx = 20;

gbc.weighty = 100;

//���б�����Ӧ�Ĳ�����Ϣ���벼�ù�����

add(gbl, style,gbc,0,0,1,3);

gbc.weightx = 100;

//�߶ȺͿ�ȶ�������ѡ�ߴ�

gbc.fill = GridBagConstraints.NONE;

gbc.anchor = GridBagConstraints.CENTER;

//���������������Ĳ�����Ϣ����

add(gbl, bold, gbc,1,0,2,1);

add(gbl, italic,gbc,1,1,2,1);

add(gbl, label,gbc,1,2,1,1);

//��Ȳ��õ�Ԫ��ȣ��߶Ȳ�����ѡ�ߴ�

gbc.fill = GridBagConstraints.HORIZONTAL;

add(gbl, size,gbc,2,2,1,1);

//���ײ�����

gbc.anchor = GridBagConstraints.SOUTH;

//�����ĸ߶Ȳ��������ߴ�ı仯���仯

gbc.weighty = 0;

add(gbl, sample,gbc,0,3,4,1);

sample.setText("The quick view box.");

pack();
setVisible(true);
}

}
