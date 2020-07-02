package com.bjsxt.factory.simplefactory;
/**
 * 测试简单工厂模式下创建对象
 * @author Administrator
 *
 */
public class Client02 {//调用者
	public static void main(String[] args) {
		Car c1=CarFactory.createCar("奥迪");
		Car c2=CarFactory.createCar("比亚迪");

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
