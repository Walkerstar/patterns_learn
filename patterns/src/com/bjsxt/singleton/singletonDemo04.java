package com.bjsxt.singleton;
/**
 * 测试静态内部类实现单例模式
 * 这种方式:线程安全，调用效率高，并且实现了延时加载
 * @author Administrator
 *
 */
public class singletonDemo04 {
	private static class singletonClassInstance{
		private static final singletonDemo04 s=new singletonDemo04();
	}
	
	private singletonDemo04() {
	}

	//方法没有同步，调用效率高！
	public static singletonDemo04 getInstance() {
		return singletonClassInstance.s;
	}
}
