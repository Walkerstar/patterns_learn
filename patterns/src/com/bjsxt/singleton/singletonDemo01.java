package com.bjsxt.singleton;
/**
 * ���Զ���ʽ����ģʽ
 * @author Administrator
 *
 */
public class singletonDemo01 {
	
	//���ʼ��ʱ�����������������û����ʱ���ص����ƣ���������ʱ����Ȼ�����̰߳�ȫ�ģ�
	private static singletonDemo01 s=new singletonDemo01();

	private  singletonDemo01() {
		
	}
	//����û��ͬ��������Ч�ʸߣ�
	public static  singletonDemo01 getInstance() {
		return s;
	}
	
	
	

}
