package com.bjsxt.strategy;

public class OldCoustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("�����");
		return standarPrice*0.8;
	}

}
