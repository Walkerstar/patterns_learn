package com.bjsxt.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * ԭ��ģʽ(���,ʹ�����л��ͷ����л��ķ�ʽʵ�����)
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
		
		//ʹ�����л��ͷ����л�ʵ�����
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(s1);
		byte[] datas=bos.toByteArray();
		
		ByteArrayInputStream bis=new ByteArrayInputStream(datas);
		ObjectInputStream ois=new ObjectInputStream(bis);
		
		Sheep s2=(Sheep) ois.readObject();
		
		System.out.println("�޸�ԭ�Ͷ��������ֵ");
		date.setTime(44646946654L);
		
		System.out.println(s1.getBirthday());
		
		s2.setSname("����");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
		
		
	}

}
