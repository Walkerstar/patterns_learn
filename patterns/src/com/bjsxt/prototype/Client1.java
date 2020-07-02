package com.bjsxt.prototype;

import java.util.Date;

/**
 * 测试原型模型(浅克隆)
 * @author Administrator
 *
 */
public class Client1 {
	public static void main(String[] args) throws Exception {
		Date date=new Date(141646313164464L);
		
		Sheep s1=new Sheep("少理",date);
		System.out.println(s1);
		System.out.println(s1.getSname());
		System.out.println(s1.getBirthday());
		
		date.setTime(1645464681031L);
		System.out.println(s1.getBirthday());
		
		Sheep s2=(Sheep) s1.clone();
		s2.setSname("多里");
		System.out.println(s2);
		System.out.println(s2.getSname());
		System.out.println(s2.getBirthday());
	}

}
