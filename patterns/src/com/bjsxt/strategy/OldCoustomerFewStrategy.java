package com.bjsxt.strategy;

public class OldCoustomerFewStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("´ò°ËÎåÕÛ");
		return standarPrice*0.85;
	}

}
