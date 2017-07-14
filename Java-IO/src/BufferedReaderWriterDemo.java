import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;


public class BufferedReaderWriterDemo {
     
      public static void main(String[] args) throws IOException {  
          FileWriter fw = new FileWriter("d:\\Buffered.txt");  
          BufferedWriter bufw = new BufferedWriter(fw);  //װ����
          //ʹ�û������еķ���������д�뵽�������С�  
          bufw.write("hello world !");  
          bufw.newLine();  
          bufw.newLine();  
          bufw.write("!hello world !");  
          bufw.write("!hello world !");  
          //ʹ�û������еķ�����������ˢ�µ�Ŀ�ĵ��ļ���ȥ��  
          bufw.flush();  
          //�رջ�����,ͬʱ�ر���fw������  
          bufw.close();     
      }  

       
      
      @Test
      public void copy() throws Exception
      {
    	   
    	        FileReader fr = new FileReader("C:\\demo.txt");  
    	        FileWriter fw = new FileWriter("D:\\love.txt");  
    	        BufferedReader bufr = new BufferedReader(fr);  
    	        BufferedWriter bufw = new BufferedWriter(fw);  
    	        //һ��һ�еČ���  
    	        String line = null;  
    	        while((line = bufr.readLine()) != null){  
    	            bufw.write(line);  
    	            bufw.newLine();  
    	            bufw.flush();  
    	        }  
    	    /*  һ���ֹ�һ���ֹ��Č��� 
    	        int ch = 0; 
    	        while((ch = bufr.read())!=-1){ 
    	            bufw.write(ch); 
    	        }*/  
    	        bufr.close();  
    	        bufw.close();  
    	    }  
      }
    
