package com.bjsxt.strategy;

public class NewCoustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("�����");
		return standarPrice*0.9;
	}

}
