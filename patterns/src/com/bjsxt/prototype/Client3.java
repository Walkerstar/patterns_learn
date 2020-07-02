package com.bjsxt.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 原型模式(深复制,使用序列化和反序列化的方式实现深复制)
 * @author Administrator
 *
 */
public class Client3 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Date date=new Date(41578481314654L);
		Sheep s1=new Sheep("hh",date);
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		//使用序列化和反序列化实现深复制
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] datas=bos.toByteArray();
		
		ByteArrayInputStream bis=new ByteArrayInputStream(datas);
		ObjectInputStream ois=new ObjectInputStream(bis);
		
		Sheep s2=(Sheep) ois.readObject();
		
		System.out.println("修改原型对象的属性值");
		date.setTime(44646946654L);
		
		System.out.println(s1.getBirthday());
		
		s2.setSname("多利");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
		
		
	}

}
