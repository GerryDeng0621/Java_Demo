package DynamicDeputy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface task{
	void meeting();
}

class Boss implements task{
	public void meeting()
	{
		System.out.println("�ϰ�ȥ����");
	};
}

class DynamicDeputy implements InvocationHandler {
    private Object sub;       //���������
 
    public DynamicDeputy() {
    }
 
    /**
     * ���췽��,����ʼ�����������
     * @param obj �Ǳ�����Ķ���
     */
    public DynamicDeputy(Object obj) {
        sub = obj;
    }
 
    /**
     *
     * @param proxy  ָ������
     * @param method ������ķ���
     * @param args   ������ķ�������Ҫ�Ĳ�������
     * @return  �ڴ���ʵ���ϴ��������ò����ؽ����
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("����ǰִ�еĲ���!");
        method.invoke(sub, args);
        System.out.println("�����ִ�еĲ���!");
        return null;
    }
}

public class DynamicDeputyDemo {
public static void main(String[] args) {
	Boss bossLi=new Boss();
	InvocationHandler dynamicDeputy = new DynamicDeputy(bossLi);
	Class<?> cls = bossLi.getClass();
	 
    // ������һ�������ɴ�����ʵ��:
    // ����һ��ָ���ӿڵĴ�����ʵ�����ýӿڿ��Խ���������ָ�ɵ�ָ���ĵ��ô������
    task subject = (task) Proxy.newProxyInstance(
            cls.getClassLoader(),           //�����������������
            cls.getInterfaces(),            //������Ҫʵ�ֵĽӿ��б�
            dynamicDeputy);                //ָ�ɷ������õĵ��ô������:InvocationHandler����

   subject.meeting();      //���ô��������ϵķ���
}	
}

