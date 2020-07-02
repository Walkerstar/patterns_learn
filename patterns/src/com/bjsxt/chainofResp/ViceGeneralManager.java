package com.bjsxt.chainofResp;
/**
 * 副总经理
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
			System.out.println("采购员:"+amount.getPurchaser()+"采购了"+amount.getPos()+"金额为:"+amount.getMoney());
			System.out.println("副总经理："+this.name+",审批通过！");
		}else {
			if(this.nextLeader!=null) {
				this.nextLeader.handleRequest(amount);
			}
		}
	}

}
