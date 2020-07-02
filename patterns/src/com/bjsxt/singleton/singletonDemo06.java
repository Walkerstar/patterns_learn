package com.bjsxt.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试懒汉式单例模式(如何防止反射和反序列化漏洞)
 * @author Administrator
 *
 */
public class singletonDemo06 implements Serializable{
	private static singletonDemo06 s;
	
	private singletonDemo06() {
		//防止反射
		if(s!=null) {
			throw new RuntimeException();
		}
	}
	
	public static singletonDemo06 getInstance() {
		if(s==null) {
			s=new singletonDemo06();
		}
		return s;
	}
	//反序列化时，如果定义了readResolve()则直接返回此方法指定的对象。而不需要单独再创建新对象！
	private Object readResolve() throws ObjectStreamException{
		return  s;
	}
	
	
}
