package com.bjsxt.observer;

import java.util.ArrayList;
import java.util.List;
/**
 * Ŀ�����:������Ϣ
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
	
	//֪ͨ���еĹ۲��߸���״̬
	public void notifyAllObserver() {
		for(Observer obs:list) {
			obs.update(this);
		}
	}
}
