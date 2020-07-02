package com.bjsxt.builder;

public class SxtAirShipBuilder implements AirShipBuilder {

	@Override
	public Engine builderEngine() {
		System.out.println("������ѧ���Ʒ�����!");
		return new Engine("��ѧ���Ʒ�����");
	}

	@Override
	public OrbitalModule builderOrbitalModule() {
		System.out.println("���������");
		return new OrbitalModule("��ѧ���ƹ����");
	}

	@Override
	public EscapeTower builderEscapeTower() {
		System.out.println("����������");
		return new EscapeTower("��ѧ����������");
	}

}
