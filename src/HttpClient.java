/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/



 import java.net.*;
 import java.io.*;
public class HttpClient {

  public HttpClient() {
  }

  public static void main(String args[]){

     String data=new HttpClient().doGet("localhost",8080,"/index.html"); //start up tomcat
     System.out.println(data);
  }
  public String doGet(String m_Host,int m_Port,String m_URL)
  {
        String strHTML=new String();
        Socket socketS;


        try{
	       socketS=new Socket(m_Host,m_Port);
	    }catch(Exception e){return strHTML;}

	    try{
	       DataOutputStream streamOut=new DataOutputStream(socketS.getOutputStream());
	       DataInputStream streamIn=new DataInputStream(socketS.getInputStream());
	       //streamOut.writeBytes("GET "+m_URL+" HTTP/1.0 \r\n\r\n");
                streamOut.writeBytes("hello");
	       String s=new String();
	       boolean done=false;
	       while(!done)
	       {
	              s=streamIn.readLine();
	              if(s==null)done=true;
	              else { strHTML+=s+"\r\n";}
           }

        }catch(Exception e){ e.printStackTrace();}
        finally{
            try{
                socketS.close();socketS=null;
                }catch(Exception e){e.printStackTrace();}
        }


        return strHTML;
} //end of doGet

}
