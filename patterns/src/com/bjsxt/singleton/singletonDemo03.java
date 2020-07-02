package com.bjsxt.singleton;
/**
 * 双重检测锁实现单例模式
 * @author Administrator
 *
 */
public class singletonDemo03 {

	private static singletonDemo03 s=null;
	
	private singletonDemo03() {
	}
	
	public static singletonDemo03 getInstance() {
		if(s==null) {
			singletonDemo03 sc;
			synchronized(singletonDemo03.class) {
				sc=s;
				if(sc==null) {
					synchronized(singletonDemo03.class) {
						sc=new singletonDemo03();
					}
					s=sc;
				}
			}
		}
		return s;
	}

	public static singletonDemo03 getInstance1(){
		if(s==null){
			synchronized (singletonDemo03.class){
				if(s==null){
					s=new singletonDemo03();
				}
			}
		}
		return s;
	}
}
