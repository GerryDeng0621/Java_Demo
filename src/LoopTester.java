/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
public class LoopTester{
    
    public static void main(String args[]){

        labelOne: for(int i=0;i<3;i++){
		        labelTwo: for(int j=0;j<3;j++){
		            labelThree: for(int k=0;k<3;k++){
		                
			            if(i==2)continue labelOne;
			            if(j==2)continue labelThree;
			            if(k==2)break labelTwo;
			            System.out.println("i="+i+"; j="+j+"; k＝"+k);
    			        
			        }
                }
        }
    }//end of main
}//end of class 
