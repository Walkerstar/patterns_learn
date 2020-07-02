package com.bjsxt.command;

public interface Command {
	/**
	 * 这个方法是一个返回结果为空的方法。
	 * 实际项目中，可以根据需求设计多个不同的方法
	 */
	void execute();
}

class ConcreteComand implements Command{

	private Receiver receiver;//命令的真正的执行者
	
	
	public ConcreteComand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.action();
	}
	
}
