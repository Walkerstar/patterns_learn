package com.bjsxt.flyweight;
/**
 * 享元类
 * @author Administrator
 *
 */
public interface ChessFlyWeight {
	void setColor(String c);
	String getColor();
	void display(Coordinate c);
}


class ConcreteChes implements ChessFlyWeight{
	private String color;
	
	
	public ConcreteChes(String color) {
		super();
		this.color = color;
	}

	@Override
	public void setColor(String c) {
		this.color=c;
	}

	@Override
	public String getColor() {
		return color;
	}

	@Override
	public void display(Coordinate c) {
		System.out.println("棋子颜色:"+color);
		System.out.println("棋子位置:"+c.getX()+"-"+c.getY());
	}
	
}