package com.bjsxt.factory.simplefactory;
/**
 * �򵥹�����
 * @author Administrator
 *
 */
public class CarFactory2 {
	public static Car createAudi() {
		return new Audi();
	}
	
	public static Car createByd() {
		return new Byd();
	} 

}
