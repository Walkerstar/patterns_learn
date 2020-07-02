package com.bjsxt.decorator;

public class Client {
	public static void main(String[] args) {
		Car car=new Car();
		car.move();
		
		System.out.println("�����µĹ��ܣ�����----------");
		FlyCar flycar=new FlyCar(car);
		flycar.move();
		
		System.out.println("�����µĹ��ܣ�ˮ����---------");
		WaterCar  waterCar = new WaterCar(car);
		waterCar.move();
		
		System.out.println("���������µĹ��ܣ����У�ˮ����-------");
		WaterCar waterCar2 = new WaterCar(new FlyCar(car));
		waterCar2.move();
	}

}
