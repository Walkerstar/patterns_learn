package com.bjsxt.factory.abstractFactory;

public class LuxuryCarFactory implements CarFactory {

	@Override
	public Engine createEnginge() {
		return new LuxuryEngine();
	}

	@Override
	public Seat createSeat() {
		return new LuxurySeat();
	}

	@Override
	public Tyre createTyre() {
		return new LuxuryTyre();
	}


}
