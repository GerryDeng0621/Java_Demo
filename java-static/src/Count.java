public class Count {
    
    private static int counter;
    public Count() 
    {
       counter++;
     }
     public static void main(String args[]){
	  System.out.println("At first,counter="+ counter);
	  Count  count1=new Count();
          System.out.println(counter);
	  Count  count2=new Count();
	  System.out.println(counter);

      }
}
