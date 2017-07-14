/****************************************************
 * �ο��鼮��<<Java���������>>                   *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/



import java.io.*;
public class FormatDataIO{
  public static void main(String[] args)throws IOException {
	  File f=new File("D:\\test.txt");
	  f.createNewFile();
    FileOutputStream out1=new FileOutputStream(f);
    BufferedOutputStream out2=new BufferedOutputStream(out1); //װ���ļ������
    DataOutputStream out=new DataOutputStream(out2); //װ�δ����������
    out.writeByte(-12);
    out.writeLong(12);
    out.writeChar('1');
    out.writeUTF("��");
    out.close();

    InputStream in1=new FileInputStream("D:\\test.txt");
    BufferedInputStream in2=new BufferedInputStream(in1); //װ���ļ�������
    DataInputStream in=new DataInputStream(in2); //װ�λ���������
    System.out.print(in.readByte()+" ");
    System.out.print(in.readLong()+" ");
    System.out.print(in.readChar()+" ");
    System.out.print(in.readUTF()+" ");
    in.close();
 }
}
