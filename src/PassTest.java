/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/
 public class PassTest {
 
 float ptValue; 
 
 // Methods to change the current values
public void changeInt (int value) {
 value = 55;
 }
 
 public void changeStr (String value) {
 value = new String ( " different " );
 }
 
 public void changeObjValue (PassTest ref) {
 ref.ptValue = 99.0f;
 }
 
 public static void main (String args[]) {
 
 String str; 
 int val;
 
 // Create an instance of the class
 
 PassTest pt = new PassTest (); 
 // Assign the int 
 val = 11;
 
 // Try to change it
 pt.changeInt (val);
 
 // What is the current value? 
 System.out.println ( " Int value is: " + val); 
 
 // Assign the string
 str = new String ( " hello " );
 
 // Try to change it
 pt.changeStr (str);
 
 // What is the current value?
 System.out.println ( " Str value is: " + str);
 
 // Now set the ptValue
 pt.ptValue = 101.0f;
 
 
 // Now change the value of the float
 // through the object reference
 pt.changeObjValue (pt);
 
 // What is the current value?
 System.out.println ( " Current ptValue is: " +
   pt.ptValue);
   }
 }
