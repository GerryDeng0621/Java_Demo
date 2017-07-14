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
          BufferedWriter bufw = new BufferedWriter(fw);  //装饰类
          //使用缓冲区中的方法将数据写入到缓冲区中。  
          bufw.write("hello world !");  
          bufw.newLine();  
          bufw.newLine();  
          bufw.write("!hello world !");  
          bufw.write("!hello world !");  
          //使用缓冲区中的方法，将数据刷新到目的地文件中去。  
          bufw.flush();  
          //关闭缓冲区,同时关闭了fw流对象  
          bufw.close();     
      }  

       
      
      @Test
      public void copy() throws Exception
      {
    	   
    	        FileReader fr = new FileReader("C:\\demo.txt");  
    	        FileWriter fw = new FileWriter("D:\\love.txt");  
    	        BufferedReader bufr = new BufferedReader(fr);  
    	        BufferedWriter bufw = new BufferedWriter(fw);  
    	        //一行一行的寫。  
    	        String line = null;  
    	        while((line = bufr.readLine()) != null){  
    	            bufw.write(line);  
    	            bufw.newLine();  
    	            bufw.flush();  
    	        }  
    	    /*  一個字節一個字節的寫。 
    	        int ch = 0; 
    	        while((ch = bufr.read())!=-1){ 
    	            bufw.write(ch); 
    	        }*/  
    	        bufr.close();  
    	        bufw.close();  
    	    }  
      }
    
