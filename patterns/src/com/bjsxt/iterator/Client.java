package com.bjsxt.iterator;

public class Client {
	public static void main(String[] args) {
		ConcreteMyAggregate cma=new ConcreteMyAggregate();
		cma.addObject("aaa");
		cma.addObject("bbb");
		cma.addObject("ccc");
		cma.addObject("ddd");
		
		MyIterator iter=cma.createIterator();
		while(iter.hasNext()) {
			System.out.println(iter.getCurrentObj());
			iter.next();
		}
	}

}
