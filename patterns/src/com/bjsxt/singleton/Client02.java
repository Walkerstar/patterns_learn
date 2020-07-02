package com.bjsxt.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试反射和反序列化破解单例模式
 * @author Administrator
 *
 */
public class Client02 {
	public static void main(String[] args) throws Exception {
		singletonDemo06 s1=singletonDemo06.getInstance();
		singletonDemo06 s2=singletonDemo06.getInstance();

		System.out.println(s1);
		System.out.println(s2);
		
		//通过反射方式直接调用私有构造器
//		Class<singletonDemo06> clazz=(Class<singletonDemo06>) Class.forName("com.bjsxt.singleton.singletonDemo06");
//		Constructor<singletonDemo06> c=clazz.getDeclaredConstructor(null);
//		c.setAccessible(true);
//		singletonDemo06 s3=c.newInstance();
//		singletonDemo06 s4=c.newInstance();
//		
//		System.out.println(s3);
//		System.out.println(s4);
		
		//通过反序列化的方式构造多个对象
		FileOutputStream fos=new FileOutputStream("g:/a.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("g:/a.txt"));
		singletonDemo06 s3=(singletonDemo06) ois.readObject();
		System.out.println(s3);
	}

}
