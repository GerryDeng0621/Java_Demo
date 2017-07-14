/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
class Share1{
    int a=0;

    synchronized void add(){
        if(a>=5)this.notify();
        a++;
        System.out.println("Adder: a="+a);
    }

    synchronized void reset() {
        if(a<5){
            System.out.println("Rester: waiting...");
            try{this.wait();}catch(Exception e){}
        }
        a=0;
        System.out.println("Rester: reseting the variable a=0");
    }
}

class Adder1 extends Thread{
    Share1 s;
    Adder1(Share1 s){this.s=s;}
    public void run(){for(int c=0;c<1000;c++){s.add();}}
}

class Reseter1 extends Thread{
    Share1 s;
    Reseter1(Share1 s){this.s=s;}
    public void run(){for(int c=0;c<1000;c++){s.reset();}}
}

public class Talker{
    public static void main(String args[]) {
		Share1 s=new Share1();
		Thread t1=new Adder1(s);
		Thread t2=new Reseter1(s);
		t1.start();
	 	t2.start();
    }
}
