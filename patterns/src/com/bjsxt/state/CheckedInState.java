package com.bjsxt.state;

public class CheckedInState implements State {

	@Override
	public void handle() {
		System.out.println("房间已入住!");
	}

}
