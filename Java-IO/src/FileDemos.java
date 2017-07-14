import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

import org.junit.Test;

class FilenameFilterImpl implements FilenameFilter{

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(".ppt");	
	}
	  
} 
public class FileDemos {
  public static void main(String[] args) {
   //FileDemos.useFilenameFilter();
	//  FileDemos.createFileDemo();
	
}

  
 /*
  * ������ɸѡ�����к�׺��Ϊppt���ļ�,�����������࣬�ص��ȼ�����
  * @author ��Ң 
  * @Test���ܲ��Ծ�̬�ķ���,junit����
  */
  @Test
  public  void useFilenameFilter()
  {	File file=new File("G:\\JAVA\\ppt");
  
//	String lists[]=file.list(new FilenameFilter(){
//		public boolean accept(File file,String name)
//		{ return name.endsWith(".ppt");}
//	});
  String lists[]=file.list(new FilenameFilterImpl());
	
  for (String s:lists)
  {System.out.println(s);
  }}
  

  @Test
  public  void createFileDemo()
  {File file=new File("c:/aaa.txt");
  try {
	file.createNewFile();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  }
 
  @Test
  public void FileInputStreamDemo()
  {
	  try {
		  File f=new File("c:/aaa.txt");
		  f.createNewFile();
		FileInputStream fis=new FileInputStream(f);
		FileOutputStream fos=new FileOutputStream("c:/bbb.txt");
		int c;
		while((c=fis.read())!=-1)
				{System.out.println((char)c);
				fos.write(c);
				}
		
	} catch ( IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
  }
  
  
}
