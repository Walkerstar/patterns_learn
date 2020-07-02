package com.bjsxt.command;

public interface Command {
	/**
	 * ���������һ�����ؽ��Ϊ�յķ�����
	 * ʵ����Ŀ�У����Ը���������ƶ����ͬ�ķ���
	 */
	void execute();
}

class ConcreteComand implements Command{

	private Receiver receiver;//�����������ִ����
	
	
	public ConcreteComand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.action();
	}
	
}
