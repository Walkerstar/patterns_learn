package com.bjsxt.strategy;

public class NewCoustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("´ò¾ÅÕÛ");
		return standarPrice*0.9;
	}

}
