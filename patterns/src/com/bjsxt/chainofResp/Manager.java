package com.bjsxt.chainofResp;
/**
 * 经理
 * @author Administrator
 *
 */
public class Manager extends Leader {

	public Manager(String name) {
		super(name);
	}

	@Override
	public void handleRequest(Purchase amount) {
		if(amount.getMoney()<10) {
			System.out.println("采购员:"+amount.getPurchaser()+"采购了"+amount.getPos()+"金额为:"+amount.getMoney());
			System.out.println("经理："+this.name+",审批通过！");
		}else {
			if(this.nextLeader!=null) {
				this.nextLeader.handleRequest(amount);
			}
		}
	}

}
