package com.bjsxt.strategy;

public class NewCoustomerFewStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("不打折，原价");
		return standarPrice;
	}

}
