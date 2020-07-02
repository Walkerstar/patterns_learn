package com.bjsxt.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ���Է���ͷ����л��ƽⵥ��ģʽ
 * @author Administrator
 *
 */
public class Client02 {
	public static void main(String[] args) throws Exception {
		singletonDemo06 s1=singletonDemo06.getInstance();
		singletonDemo06 s2=singletonDemo06.getInstance();

		System.out.println(s1);
		System.out.println(s2);
		
		//ͨ�����䷽ʽֱ�ӵ���˽�й�����
//		Class<singletonDemo06> clazz=(Class<singletonDemo06>) Class.forName("com.bjsxt.singleton.singletonDemo06");
//		Constructor<singletonDemo06> c=clazz.getDeclaredConstructor(null);
//		c.setAccessible(true);
//		singletonDemo06 s3=c.newInstance();
//		singletonDemo06 s4=c.newInstance();
//		
//		System.out.println(s3);
//		System.out.println(s4);
		
		//ͨ�������л��ķ�ʽ����������
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
