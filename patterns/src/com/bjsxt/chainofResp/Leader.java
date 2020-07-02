package com.bjsxt.chainofResp;
/**
 * ������ģʽ,������
 * @author Administrator
 *
 */
public abstract class Leader {
	protected  String name;
	protected Leader nextLeader;//�������ϵĺ�̶���
	
	public Leader(String name) {
		super();
		this.name = name;
	}

	//�趨�������ϵĺ�̶���
	public void setNextLeader(Leader nextLeader) {
		this.nextLeader = nextLeader;
	}
	
	/**
	 * ��������ĺ���ҵ�񷽷�
	 */
	public abstract void handleRequest(Purchase amount);
	
}
