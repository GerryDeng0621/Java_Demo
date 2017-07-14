

/*
 * ��ʾ Calendar ��һ�����
 */
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Calendar;

public class CalendarDemo
{


  public static void main(String[] args)
  {
	// �ַ���ת�����ڸ�ʽ  
	    // DateFormat fmtDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	    // �õ����ڸ�ʽ����  
	    // Date date = fmtDateTime.parse(strDateMake);  
	  
	    // ������ʾ����ʱ��  
	    String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(new Date());  
	    System.out.println(str);  
	  
	    // ���� Calendar ����  
	    Calendar calendar = Calendar.getInstance();  
	    // ��ʼ�� Calendar ���󣬵�������Ҫ��������Ҫ����ʱ��  
	    calendar.setTime(new Date());  
		  
	    // ��ʾ���  
	    int year = calendar.get(Calendar.YEAR);  
	    System.out.println("YEAR is = " + String.valueOf(year));  
	  
	    // ��ʾ�·� (��0��ʼ, ʵ����ʾҪ��һ)  
	    int MONTH = calendar.get(Calendar.MONTH);  
	    System.out.println("MONTH is = " + (MONTH + 1));  
	  
	   // ����ĵ� N ��  
	    int DAY_OF_YEAR = calendar.get(Calendar.DAY_OF_YEAR);  
	    System.out.println("DAY_OF_YEAR is = " + DAY_OF_YEAR);  
	  
	    // ���µ� N ��  
	    int DAY_OF_MONTH = calendar.get(Calendar.DAY_OF_MONTH);  
	    System.out.println("DAY_OF_MONTH = " + String.valueOf(DAY_OF_MONTH));  
	  
	    // 3Сʱ�Ժ�  
	    calendar.add(Calendar.HOUR_OF_DAY, 3);  
	    int HOUR_OF_DAY = calendar.get(Calendar.HOUR_OF_DAY);  
	    System.out.println("HOUR_OF_DAY + 3 = " + HOUR_OF_DAY);  
	  
	    // ��ǰ������  
	    int MINUTE = calendar.get(Calendar.MINUTE);  
	    System.out.println("MINUTE = " + MINUTE);  
	  
	    // 15 �����Ժ�  
	    calendar.add(Calendar.MINUTE, 15);  
	    MINUTE = calendar.get(Calendar.MINUTE);  
	    System.out.println("MINUTE + 15 = " + MINUTE);  
	  
	    // 30����ǰ  
	    calendar.add(Calendar.MINUTE, -30);  
	    MINUTE = calendar.get(Calendar.MINUTE);  
	    System.out.println("MINUTE - 30 = " + MINUTE);  
	  
	    // ��ʽ����ʾ  
	    str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime());  
	    System.out.println(str);  
	  
	    // ���� Calendar ��ʾ��ǰʱ��  
	    calendar.setTime(new Date());  
	    str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime());  
	    System.out.println(str);  
	  
	    // ����һ�� Calendar ���ڱȽ�ʱ��  
	    Calendar calendarNew = Calendar.getInstance();  
	  
	    // �趨Ϊ 5 Сʱ��ǰ�����ߴ���ʾ -1  
	    calendarNew.add(Calendar.HOUR, -5);  
	    System.out.println("ʱ��Ƚϣ�" + calendarNew.compareTo(calendar));  
	  
	    // �趨7Сʱ�Ժ�ǰ�ߴ���ʾ 1  
	    calendarNew.add(Calendar.HOUR, +7);  
	    System.out.println("ʱ��Ƚϣ�" + calendarNew.compareTo(calendar));  
	  
	    // �˻� 2 Сʱ��ʱ����ͬ����ʾ 0  
	    calendarNew.add(Calendar.HOUR, -2);  
	    System.out.println("ʱ��Ƚϣ�" + calendarNew.compareTo(calendar));  
	  }  
}
