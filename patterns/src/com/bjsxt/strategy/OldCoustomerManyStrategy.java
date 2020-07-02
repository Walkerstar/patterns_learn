package com.bjsxt.strategy;

public class OldCoustomerManyStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("¥Ú∞À’€");
		return standarPrice*0.8;
	}

}
