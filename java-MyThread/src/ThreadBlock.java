import java.io.IOException;
import java.util.Scanner;


public class ThreadBlock  extends Thread{


	public void run() {
	for(int a=0;a<50;a++)
	{System.out.println(this.currentThread().getName()+";"+a);
		
	}
	}
	
public static void main(String[] args) throws IOException {
   ThreadBlock tb=new ThreadBlock();
   tb.start();
    tb.run();
    //�̵߳����ȼ�
  //  tb.setPriority(MAX_PRIORITY)
  //  tb.setPriority(MIN_PRIORITY)
	Scanner s=new Scanner(System.in);
	System.out.println("������:");
	System.out.println(s.nextLine());
	tb.run();
	System.out.println("is tb alive:"+tb.isAlive());
}
}
