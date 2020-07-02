package com.bjsxt.singleton;
/**
 * 测试饿汉式单例模式
 * @author Administrator
 *
 */
public class singletonDemo01 {
	
	//类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的！
	private static singletonDemo01 s=new singletonDemo01();

	private  singletonDemo01() {
		
	}
	//方法没有同步，调用效率高！
	public static  singletonDemo01 getInstance() {
		return s;
	}
	
	
	

}
