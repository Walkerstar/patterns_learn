package com.bjsxt.factory.simplefactory;
/**
 * ���Լ򵥹���ģʽ�´�������
 * @author Administrator
 *
 */
public class Client02 {//������
	public static void main(String[] args) {
		Car c1=CarFactory.createCar("�µ�");
		Car c2=CarFactory.createCar("���ǵ�");

		assert c1 != null;
		c1.run();
		assert c2 != null;
		c2.run();
		
		Car c3=CarFactory2.createAudi();
		Car c4=CarFactory2.createByd();
		
		c3.run();
		c4.run();
	}

}
