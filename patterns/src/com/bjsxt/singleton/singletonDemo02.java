package com.bjsxt.singleton;
/**
 * ��������ʽ����ģʽ
 * @author Administrator
 *
 */
public class singletonDemo02 {
	//���ʼ��ʱ������ʼ�����������ʱ���أ������õ�ʱ���ٴ�������
	private static singletonDemo02 s;
	
	private  singletonDemo02() {
		
	}
	//����ͬ��������Ч�ʵͣ�
	public static synchronized singletonDemo02 getInstance() {
		if(s==null) {
			s=new singletonDemo02();
		}
		return s;
	}
}
