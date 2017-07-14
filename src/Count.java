/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
 public class Count {
             private int serialNumber;
             private static int counter = 0;
             public Count() {
               counter++;
               serialNumber = counter;
		System.out.println("My serialNumber is " + serialNumber);
             }
			public static void main(String args[])
			{
				System.out.println("At first,counter="+ counter);
				Count  count1=new Count();
                                System.out.println("after creat count1, counter="+counter);
				Count  count2=new Count();
				System.out.println("At last counter="+counter);

                                System.out.println("count1.serialNumber"+count1.serialNumber);
                                System.out.println("count2.serialNumber"+count2.serialNumber);
                                System.out.println("count1.counter"+count1.counter);
                                System.out.println("count2.counter"+count2.counter);
                                System.out.println("Count.counter"+Count.counter);



			}
           }
