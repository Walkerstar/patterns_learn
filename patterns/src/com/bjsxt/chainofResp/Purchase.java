package com.bjsxt.chainofResp;
/**
 * ��װ�ɹ��Ļ�����Ϣ
 * @author Administrator
 *
 */
public class Purchase {
	private String purchaser;//�ɹ���
	private int money;//�ɹ����
	private String pos;//�ɹ�����
	
	public Purchase(String purchaser, int money, String pos) {
		super();
		this.purchaser = purchaser;
		this.money = money;
		this.pos = pos;
	}

	public String getPurchaser() {
		return purchaser;
	}

	public void setPurchaser(String purchaser) {
		this.purchaser = purchaser;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}
	
	
	

}
