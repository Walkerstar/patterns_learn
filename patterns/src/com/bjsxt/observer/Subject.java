package com.bjsxt.observer;

import java.util.ArrayList;
import java.util.List;
/**
 * 目标对象:发布消息
 * @author Administrator
 *
 */
public class Subject {
	protected List<Observer> list=new ArrayList<Observer>();
	
	public  void registerObserver(Observer obs) {
		list.add(obs);
	}
	
	public void removeObserver(Observer obs) {
		list.remove(obs);
	}
	
	//通知所有的观察者更新状态
	public void notifyAllObserver() {
		for(Observer obs:list) {
			obs.update(this);
		}
	}
}
