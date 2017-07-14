/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
public class aaa{ 
public static void main(String argv[]){ 
Pmcraven pm1 = new Pmcraven("one"); 
pm1.run(); 
pm1.yield();
Pmcraven pm2 = new Pmcraven("two"); 
pm2.run(); 

} 
} 

class Pmcraven extends Thread{ 
    private String sTname=""; 
        Pmcraven(String s){ 
        sTname = s; 
    } 
    public void run(){ 
        for(int i =0; i < 2 ; i++){ 
            try{ 
            sleep(1000); 
            }catch(InterruptedException e){} 
          
            System.out.println(sTname); 
            yield(); 
        } 
    } 
}
 
