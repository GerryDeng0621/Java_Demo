/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
package mythread;


class Operator{
 public void doing(){

   synchronized(this){
      for(int i=0;i<50;i++){
         System.out.println(Thread.currentThread().getName()+":"+i);
      }
    }
 }


  public void doingElse(){


      for(int i=0;i<50;i++){
         System.out.println(Thread.currentThread().getName()+":"+i);
      }

 }
}

class OtherThread extends Thread{
  Operator o;
  public void run(){
    o.doingElse();

  }

}
public class ExplainThis extends Thread{

  Operator o;
  public void run(){
    o.doing();

  }

  public ExplainThis() {
  }

  public  static void main(String args[]){

    Operator o1=new Operator();
    Operator o2=new Operator();
    ExplainThis s1=new ExplainThis();
    ExplainThis s2=new ExplainThis();

    s1.setName("ExplainThis1");
    s2.setName("ExplainThis2");

    s1.o=o1;
    s2.o=o2;

    s1.start();
    s2.start();

  }
}
