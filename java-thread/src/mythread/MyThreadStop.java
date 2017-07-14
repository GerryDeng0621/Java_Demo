/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package mythread;
public class MyThreadStop extends Thread{
	int a; boolean flag=false;
	public void run(){
		while(!flag){

		System.out.println(a++);
                }
	}
	public void setFlag(boolean _flag){
		flag=_flag;
	}
	public static void main(String args[]){
		MyThreadStop t=new MyThreadStop();
		t.start();
		try{ Thread.sleep(1000);}catch(Exception e){}
		t.setFlag(true);
	}
 }
