/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

 import java.util.*;
 import java.text.*;
 public final class DateConverter {

   private static String day_of_the_week [] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

 public static String getDayOfWeek (String theDate){
   int month, day, year;

   StringTokenizer st =
     new StringTokenizer (theDate, "/");
   month = Integer.parseInt(st.nextToken ());
   day = Integer.parseInt(st.nextToken());
   year = Integer.parseInt(st.nextToken());
   Date d = new Date (year, month, day);

   return (day_of_the_week[d.getDay()]);
   }
 }
