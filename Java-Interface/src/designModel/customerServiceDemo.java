package designModel;
interface InternetService{
	public void connect();
	public void disconnect();
}
interface MailService{
	public void send();
	public void receive();
}
interface VirusService{
	public void begin();
	public void end();
}
class InternetServiceImpl implements InternetService{
	public void connect(){
		System.out.println("开始连接网络..."); 
	}
	public void disconnect(){
		System.out.println("开始关闭网络..."); 
	}
}
class MailServiceImpl implements MailService{
	public void send(){
		System.out.println("开始发送邮件..."); 
	}
	public void receive(){
		System.out.println("开始接收邮件..."); 
	}
}
class VirusServiceImpl implements VirusService{
	public void begin(){
		System.out.println("开始检查病毒..."); 
	}
	public void end(){
		System.out.println("检查病毒完毕..."); 
	}
}
//既可上网又可收发邮件
interface Menu1 extends InternetService,MailService{
}
//既可上网又可杀毒
interface Menu2 extends InternetService,VirusService{
}
class Menu1Impl implements Menu1{
	private InternetService is;
	private MailService ms;
	public Menu1Impl(InternetService is,MailService ms){
		this.is = is;
		this.ms = ms;
	}
	public void connect(){
		is.connect();
	}
	public void disconnect(){
		is.disconnect();
	}
	public void send(){
		ms.send();
	}
	public void receive(){
		ms.receive();
	}
}
class Menu2Impl implements Menu2{
	private InternetService is;//
	private VirusService vs;
	public Menu2Impl(InternetService is,VirusService vs){
		this.is = is;
		this.vs = vs;
	}
	public void connect(){
		is.connect();
	}
	public void disconnect(){
		is.disconnect();
	}
	public void begin(){
		vs.begin();
	}
	public void end(){
		vs.end();
	}
}
public class customerServiceDemo{
	public static void main(String args[]){
		InternetService is = new InternetServiceImpl();
		MailService ms = new MailServiceImpl();
		VirusService vs = new VirusServiceImpl();
		Menu1Impl m1 = new Menu1Impl(is,ms);
		Menu2Impl m2 = new Menu2Impl(is,vs);
		System.out.println("检测menu1的功能中......"); 
		m1.connect();
		m1.disconnect();
		m1.send();
		m1.receive();
		System.out.println("检测menu2的功能中......"); 
		m2.connect();
		m2.disconnect();
		m2.begin();
		m2.end();
	}
}


