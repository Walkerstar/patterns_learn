package com.bjsxt.command;
/**
 * ������/������
 * @author Administrator
 *
 */
public class Invoke {
	//Ҳ����ͨ������List<Command>���ɺܶ�������󣬽������������ݿ�ײ���������������ƵĽṹ��
	private Command command;

	public Invoke(Command command) {
		super();
		this.command = command;
	}
	//ҵ�񷽷� �����ڵ���������ķ���
	public void call() {
		command.execute();
	}
}
