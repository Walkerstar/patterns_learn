package com.bjsxt.adapter;
/**
 *  ������ (������������ʽ,ʹ������ϵķ�ʽ���������������)
 * (�൱��usb��ps/2��ת����)
 * @author Administrator
 *
 */
public class Adapter2 implements Target {
	private Adaptee a;
	
	
	
	public Adapter2(Adaptee a) {
		this.a = a;
	}



	@Override
	public void handlReq() {
		a.request();
	}

}
