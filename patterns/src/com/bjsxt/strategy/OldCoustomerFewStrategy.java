package com.bjsxt.strategy;

public class OldCoustomerFewStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("�������");
		return standarPrice*0.85;
	}

}
