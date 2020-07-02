package com.bjsxt.command;

public class Client {
	public static void main(String[] args) {
		Command c=new ConcreteComand(new Receiver());
		Invoke i=new Invoke(c);
		i.call();
	}

}
