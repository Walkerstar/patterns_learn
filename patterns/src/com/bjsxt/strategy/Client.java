package com.bjsxt.strategy;

public class Client {
	public static void main(String[] args) {
		Strategy s1=new OldCoustomerFewStrategy();
		Context ctx=new Context(s1);
		
		ctx.printPrice(998);
	}

}
