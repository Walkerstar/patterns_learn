package com.bjsxt.singleton;
/**
 * ���Ծ�̬�ڲ���ʵ�ֵ���ģʽ
 * ���ַ�ʽ:�̰߳�ȫ������Ч�ʸߣ�����ʵ������ʱ����
 * @author Administrator
 *
 */
public class singletonDemo04 {
	private static class singletonClassInstance{
		private static final singletonDemo04 s=new singletonDemo04();
	}
	
	private singletonDemo04() {
	}

	//����û��ͬ��������Ч�ʸߣ�
	public static singletonDemo04 getInstance() {
		return singletonClassInstance.s;
	}
}
