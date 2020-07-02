package com.bjsxt.singleton;

public class Client01 {
	public static void main(String[] args) {
		singletonDemo01 s1=singletonDemo01.getInstance();
		singletonDemo04 s2=singletonDemo04.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);		
		
		System.out.println(singletonDemo05.INSTANCE==singletonDemo05.INSTANCE);
	}

}
