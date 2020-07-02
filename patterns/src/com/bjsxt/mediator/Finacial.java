package com.bjsxt.mediator;

public class Finacial implements Department {

	private Mediator m;  //�����н���(�ܾ���)������
	
	public Finacial(Mediator m) {
		super();
		this.m = m;
		m.register("finacial", this);
	}

	@Override
	public void outAction() {
		System.out.println("�㱨������ûǮ�ˣ�Ǯ̫���ˣ���ô��?");
	}

	@Override
	public void selfAction() {
		System.out.println("��Ǯ��");
	}

}
