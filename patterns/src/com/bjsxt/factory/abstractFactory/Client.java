package com.bjsxt.factory.abstractFactory;

public class Client {
	public static void main(String[] args) {
		CarFactory factory=new LuxuryCarFactory();
		Engine e=factory.createEnginge();
		e.run();
		e.start();
		
		Seat s=factory.createSeat();
		s.massage();
		
		CarFactory factory1=new LowCarFactory();
		Engine e1=factory1.createEnginge();
		e1.run();
		e1.start();
	}

}
