package com.bjsxt.strategy;
/**
 *  ����;���Ĳ����ཻ��
 * �����Ļ���������㷨��ֱ�ӵĿͻ��˵��÷����ˣ�ʹ���㷨���Զ����ڿͻ��˶����ı仯��
 * ���ʹ��spring������ע�빦�ܣ�������ͨ�������ļ�����̬��ע�벻ͬ���Զ��󣬶�̬���л���ͬ���㷨.
 * @author Administrator
 *
 */
public class Context {
	
	private Strategy strategy;//��ǰ�Ĳ��õ��㷨����
	
	//����ͨ����������ע��
	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public void setStrategy(Strategy strategy) {
		this.strategy=strategy;
	}
	
	public void printPrice(double s) {
		System.out.println("��ı���:"+strategy.getPrice(s));
	}
	
}
