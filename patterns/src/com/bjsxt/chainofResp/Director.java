package com.bjsxt.chainofResp;

public class Director extends Leader {

	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Purchase amount) {
		if(amount.getMoney()<5) {
			System.out.println("采购员:"+amount.getPurchaser()+"采购了"+amount.getPos()+"金额为:"+amount.getMoney());
			System.out.println("主任："+this.name+",审批通过！");
		}else {
			if(this.nextLeader!=null) {
				this.nextLeader.handleRequest(amount);
			}
		}
	}
	
	

}
