package com.bjsxt.factory.abstractFactory;

public class LowCarFactory implements CarFactory{

	@Override
	public Engine createEnginge() {
		return new LowEngine();
	}

	@Override
	public Seat createSeat() {
		return new LowSeat();
	}

	@Override
	public Tyre createTyre() {
		return new LowTyre();
	}

}
