package com.bjsxt.strategy;

public class NewCoustomerFewStrategy implements Strategy{

	@Override
	public double getPrice(double standarPrice) {
		System.out.println("�����ۣ�ԭ��");
		return standarPrice;
	}

}
