package com.bjsxt.bridge;

public class Client {
	public static void main(String[] args) {
		//��������ıʼǱ�����
		Computer2 c=new Laptop2(new Lenovo());
		c.sale();
		
		//�������۵�̨ʽ��
		Computer2 c2 = new Desktop2(new Shenzhou());
		c2.sale();
	}

}
