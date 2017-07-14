/****************************************************
 * 参考书籍：<<Java面向对象编程>>                   *
 * 技术支持网址：www.javathinker.org                *
 ***************************************************/

package reflect.sample;

public class TestTarget implements TestInterface
{
    public String doTest1(String aStr, int aNumber)
    {
        return aStr+aNumber;
    }

    public void doTest2(String[] strs)
    {
        throw new RuntimeException("I don't know what to do in doTest2");
    }
}
