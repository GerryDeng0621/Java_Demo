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
		System.out.println("老板去开会");
	};
}

class DynamicDeputy implements InvocationHandler {
    private Object sub;       //被代理对象
 
    public DynamicDeputy() {
    }
 
    /**
     * 构造方法,并初始化被代理对象
     * @param obj 是被代理的对象
     */
    public DynamicDeputy(Object obj) {
        sub = obj;
    }
 
    /**
     *
     * @param proxy  指代理类
     * @param method 被代理的方法
     * @param args   被代理的方法所需要的参数数组
     * @return  在代理实例上处理方法调用并返回结果。
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理前执行的操作!");
        method.invoke(sub, args);
        System.out.println("代理后执行的操作!");
        return null;
    }
}

public class DynamicDeputyDemo {
public static void main(String[] args) {
	Boss bossLi=new Boss();
	InvocationHandler dynamicDeputy = new DynamicDeputy(bossLi);
	Class<?> cls = bossLi.getClass();
	 
    // 以下是一次性生成代理类实例:
    // 返回一个指定接口的代理类实例，该接口可以将方法调用指派到指定的调用处理程序。
    task subject = (task) Proxy.newProxyInstance(
            cls.getClassLoader(),           //定义代理类的类加载器
            cls.getInterfaces(),            //代理类要实现的接口列表
            dynamicDeputy);                //指派方法调用的调用处理程序:InvocationHandler对象

   subject.meeting();      //调用代理处理器上的方法
}	
}

