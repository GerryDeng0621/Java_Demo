/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package mythread;
class Share{
    int a=0;//共享变量a
    synchronized void add(){

        while(a==5){
        System.out.println("Adder: notify");
        this.notify();
        try{System.out.println("Adder: wait"); this.wait();}catch(Exception e){}
        }


        a++;
        System.out.println("Adder: a="+a);
    }
    synchronized void reset() {
        while(a<5){

        try{
        System.out.println("Rester: notify");
        this.notify();
        System.out.println("Rester: wait");
        this.wait();}catch(Exception e){e.printStackTrace();}

        //System.out.println("Rester: notify");
        //this.notify();
        }
        a=0;
        System.out.println("Rester: reseting the variable a=0");
    }
}

class Adder extends Thread{
    Share s;
    Adder(Share s){this.s=s;}
    public void run(){
      for(int c=0;c<1000;c++){
      System.out.println("adder : c="+c);
      s.add();
      }
    }
}

class Reseter extends Thread{
    Share s;
    Reseter(Share s){this.s=s;}
    public void run(){for(int c=0;c<1000;c++){s.reset();}}
}

public class SynExample{
    public static void main(String args[]) {
		Share s=new Share();
		Thread t1=new Adder(s);
		Thread t2=new Reseter(s);
		t1.start();
	 	t2.start();
    }
}
