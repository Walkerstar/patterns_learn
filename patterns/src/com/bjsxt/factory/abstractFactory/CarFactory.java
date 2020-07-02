package com.bjsxt.factory.abstractFactory;

public interface CarFactory {
	Engine createEnginge();
	Seat createSeat();
	Tyre createTyre();

}
