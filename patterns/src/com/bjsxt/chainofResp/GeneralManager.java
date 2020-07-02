package com.bjsxt.chainofResp;
/**
 * 总经理
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
			System.out.println("采购员:"+amount.getPurchaser()+"采购了"+amount.getPos()+"金额为:"+amount.getMoney());
			System.out.println("总经理："+this.name+",审批通过！");
		}else {
			System.out.println(amount.getPos()+"未通过");
		}
	}
	
	
}
