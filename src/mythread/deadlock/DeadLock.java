/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
   package mythread.deadlock;
   import java.util.*;

   public class DeadLock {
       public static void main(String args[]) {

           SyncStack stack1 = new SyncStack("stack1");
           SyncStack stack2 = new SyncStack("stack2");
           stack1.setAnotherStack(stack2);
           stack2.setAnotherStack(stack1);

           Thread1 t1=new Thread1(stack1);
           Thread1 t2=new Thread1(stack2);
           t1.start();
           t2.start();
       }
  }

   class Thread1 extends Thread {
       private SyncStack theStack;

       private int num;
       private static int counter = 1;

       public Thread1 (SyncStack s) {
           theStack = s;

           num = counter++;
       }



       public void run() {

           for (int i = 0; i < 200; i++) {

                  theStack.pop();


           }
       }
   }


   class SyncStack {
       private SyncStack anotherStack;

       int buffer=0;
       private String name;


       public SyncStack(String name){this.name=name; }

       public void setAnotherStack(SyncStack stack){anotherStack=stack;}

       public  synchronized void pop() {

           buffer--;
           try { Thread.sleep(100); } catch (InterruptedException e) { }
           System.out.println("pop "+name+": "+buffer+" by " +Thread.currentThread().getName()  );

           anotherStack.push();
       }

       public synchronized void push() {
           buffer++;
           try { Thread.sleep(100); } catch (InterruptedException e) { }
           System.out.println("push "+name+": "+buffer +" by " +Thread.currentThread().getName() );


       }


       public String toString(){
        return "Statck";
       }
   }
