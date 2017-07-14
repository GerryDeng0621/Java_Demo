import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class java_String {
public static void main(String[] args) throws UnsupportedEncodingException {
String str="2008-12-1";
SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
try{
 Date date=sdf.parse(str);
 System.out.println(date);  //Mon Dec 01 00:00:00 CST 2008
}
catch(Exception ex){
 System.out.println(ex.getMessage());
}

  
}
}
