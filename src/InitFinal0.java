/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
/** InitFinal0.java */
public class InitFinal0
{
		 final int x;
		 InitFinal0(){

                 }
		 InitFinal0(int a){
                    x=a;
                 }


                 void test(){
                   //x=1;
                 }
}

class InitFinal1
{
		final int var=0;
		void test()
		{

		}
}

class InitFinal2{
		static final int var=0;
		InitFinal2(){
			//var=1;//COMPLIE ERROR
		}
}


class InitFinal3{
		static final int var=0;
		void test(){
		//var=1;//COMPLIE ERROR
		}
}

