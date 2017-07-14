/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
class ClassA{
	private int vA=0;
	class B{
		int vB=vA; //CORRECT
	}

    void methodA(final int param1,int param2){
		    final int localV=0;

		    class C{
                            int vC;
			    void methodC() {
				    int v1C=vA; //CORRECT
				    int v2C=localV;	 //CORRECT
		    	             int v3C=param1; //CORRECT
		 		   // int v4C=param2; //ERROR
			    }
		    }//end of class C
   }//end of methodA
}//end of class A

