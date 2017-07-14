package staticFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MyUtil {
	public  String getProperties(String className) throws IOException {
		InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("staticFactory/config.properties");
		//System.out.println("begin!!!");
		Properties properties = new Properties();
		try{
			properties.load(inputStream);
		}catch (IOException ioE){
			ioE.printStackTrace();
		}finally{
			inputStream.close();
		}
		return properties.getProperty(className);
	}
}
