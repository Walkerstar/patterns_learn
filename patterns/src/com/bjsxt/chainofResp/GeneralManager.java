package com.bjsxt.chainofResp;
/**
 * �ܾ���
 * @author Administrator
 *
 */
public class GeneralManager extends Leader {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Purchase amount) {
		if(amount.getMoney()>=20) {
			System.out.println("�ɹ�Ա:"+amount.getPurchaser()+"�ɹ���"+amount.getPos()+"���Ϊ:"+amount.getMoney());
			System.out.println("�ܾ���"+this.name+",����ͨ����");
		}else {
			System.out.println(amount.getPos()+"δͨ��");
		}
	}
	
	
}
