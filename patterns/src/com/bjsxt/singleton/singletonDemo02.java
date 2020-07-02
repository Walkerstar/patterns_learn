package com.bjsxt.singleton;
/**
 * 测试懒汉式单例模式
 * @author Administrator
 *
 */
public class singletonDemo02 {
	//类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
	private static singletonDemo02 s;
	
	private  singletonDemo02() {
		
	}
	//方法同步，调用效率低！
	public static synchronized singletonDemo02 getInstance() {
		if(s==null) {
			s=new singletonDemo02();
		}
		return s;
	}
}
