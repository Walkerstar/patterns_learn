package com.bjsxt.chainofResp;

public class Director extends Leader {

	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Purchase amount) {
		if(amount.getMoney()<5) {
			System.out.println("�ɹ�Ա:"+amount.getPurchaser()+"�ɹ���"+amount.getPos()+"���Ϊ:"+amount.getMoney());
			System.out.println("���Σ�"+this.name+",����ͨ����");
		}else {
			if(this.nextLeader!=null) {
				this.nextLeader.handleRequest(amount);
			}
		}
	}
	
	

}
