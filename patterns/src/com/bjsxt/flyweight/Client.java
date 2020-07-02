package com.bjsxt.flyweight;

public class Client {
	public static void main(String[] args) {
		ChessFlyWeight c1=ChessFlyWeightFactory.getChess("黑色");
		ChessFlyWeight c2=ChessFlyWeightFactory.getChess("黑色");

		System.out.println(c1);
		System.out.println(c2);//已经产生了对象，所以返回已产生的对象
		
		c1.display(new Coordinate(10,10));
		c2.display(new Coordinate(10,14));
		
	}

}
