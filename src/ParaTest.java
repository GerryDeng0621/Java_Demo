/****************************************************
 * �ο��鼮��<<Java���������>>                   *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
public class ParaTest{
    public int v=0;

    public static void main(String args[]){
	    //��������ʼ��4���ֲ�����
	    int p1=0; // p1�ǻ�����������
	    ParaTest p2=new ParaTest(); //p2 �Ƕ�����������
	    ParaTest p3=new ParaTest();//p3 �Ƕ�����������
	    int[] p4={0}; //p4 ��������������
        		
	    //��4���ֲ�������Ϊ�������ݸ�changeParameter()����
        changeParameter(p1, p2, p3, p4);					
        //��ӡ4���ֲ�����
        System.out.println("p1= " +p1);
        System.out.println("p2.v= " + p2.v);
        System.out.println("p3.v= " + p3.v);
        System.out.println("p4[0]= " +p4[0]);
    				
    }

    public static void changeParameter(int p1, ParaTest p2, ParaTest  
    p3, int[] p4)
    {
		p1=1; //�ı�����������Ͳ�����ֵ
		p2.v=1; //�ı�������Ͳ�����ʵ������
		p3=new ParaTest();  //�ı�������Ͳ��������ã�ʹ������һ���µĶ���
		p3.v=1; //�ı��µĶ����ʵ������
		p4[0]=1; //�ı��������Ͳ�����Ԫ��
    }
}
