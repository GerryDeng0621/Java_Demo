/****************************************************
 * �ο��鼮��<<Java���������>>                   *
 * ����֧����ַ��www.javathinker.org                *
 ***************************************************/
public class CTest{
public static void main(String args[]){
Thread t1=new Thread(){ 
public void run(){ 
for(int i=0;i<5;i++)
System.out.println(i);
}
};
Thread t2=new Thread(new Runnable(){ 
public void run(){ 
for(int i=0;i<5;i++)
System.out.println(i);
}
});
}//end of main
}//end of class
