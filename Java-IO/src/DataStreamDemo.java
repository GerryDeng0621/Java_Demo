import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;


public class DataStreamDemo {
	public static void main(String[] args)throws Exception {
		 DataOutputStream out=null;
		 DataInputStream in=null;
		try{
		FileOutputStream out1=new FileOutputStream("D:\\test.txt");
	    BufferedOutputStream out2=new BufferedOutputStream(out1); //װ���ļ������
	     out=new DataOutputStream(out2); //װ�δ����������
	    out.writeByte(-12);
	    out.writeLong(12);
	    out.writeChar('1');
	    out.writeUTF("��");
	    out.close();
	    InputStream in1=new FileInputStream("D:\\test.txt");
	    BufferedInputStream in2=new BufferedInputStream(in1); //װ���ļ�������
	    in=new DataInputStream(in2); //װ�λ���������
	    System.out.print(in.readByte()+" ");
	    System.out.print(in.readLong()+" ");
	    System.out.print(in.readChar()+" ");
	  System.out.print(in.readUTF()+" ");
	    }
	    catch(Exception ex)
	    {ex.printStackTrace();
	    	
	    }
	    finally
	    {  
	    
	    }
}
	   
	}


