/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

class AnswerWrongException extends Exception {
    private int result;
    public AnswerWrongException (int result){
      this.result=result;
    }
    public int getResult() {
      return result;
    }
 }


public class ExceptionTester{
  public static void test(int x,int y,int z)throws AnswerWrongException{
    if(x+y!=z) throw new AnswerWrongException(z);
    System.out.println(x+"+"+y+"="+z); 
  }
  public static void main(String args[]) {
    try{
      test(1,2,5);
      System.out.println("end");
    }catch( AnswerWrongException e){
       System.out.println("result is wrong:"+e.getResult());
       e.printStackTrace();
    }
  }
}
