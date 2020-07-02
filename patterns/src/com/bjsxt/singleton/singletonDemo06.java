package com.bjsxt.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * ��������ʽ����ģʽ(��η�ֹ����ͷ����л�©��)
 * @author Administrator
 *
 */
public class singletonDemo06 implements Serializable{
	private static singletonDemo06 s;
	
	private singletonDemo06() {
		//��ֹ����
		if(s!=null) {
			throw new RuntimeException();
		}
	}
	
	public static singletonDemo06 getInstance() {
		if(s==null) {
			s=new singletonDemo06();
		}
		return s;
	}
	//�����л�ʱ�����������readResolve()��ֱ�ӷ��ش˷���ָ���Ķ��󡣶�����Ҫ�����ٴ����¶���
	private Object readResolve() throws ObjectStreamException{
		return  s;
	}
	
	
}
