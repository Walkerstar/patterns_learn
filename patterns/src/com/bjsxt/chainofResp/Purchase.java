package com.bjsxt.chainofResp;
/**
 * 封装采购的基本信息
 * @author Administrator
 *
 */
public class Purchase {
	private String purchaser;//采购人
	private int money;//采购金额
	private String pos;//采购订单
	
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
