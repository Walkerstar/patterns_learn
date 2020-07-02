package com.bjsxt.chainofResp;
/**
 * ���ܾ���
 * @author Administrator
 *
 */
public class ViceGeneralManager extends Leader{

	public ViceGeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Purchase amount) {
		if(amount.getMoney()<20) {
			System.out.println("�ɹ�Ա:"+amount.getPurchaser()+"�ɹ���"+amount.getPos()+"���Ϊ:"+amount.getMoney());
			System.out.println("���ܾ���"+this.name+",����ͨ����");
		}else {
			if(this.nextLeader!=null) {
				this.nextLeader.handleRequest(amount);
			}
		}
	}

}
