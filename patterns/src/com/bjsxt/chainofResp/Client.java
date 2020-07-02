package com.bjsxt.chainofResp;

public class Client {
	public static void main(String[] args) {
		Leader a=new Director("��");
		Leader b=new Manager("����");
		Leader c=new ViceGeneralManager("����");
		Leader d=new GeneralManager("С��");
		
		//��֯����������Ĺ�ϵ
		a.setNextLeader(b);
		b.setNextLeader(c);
		c.setNextLeader(d);
		
		Purchase p=new Purchase("Tom",25,"���ִ�ý��Ʒ");
		a.handleRequest(p);
		
	}

}
