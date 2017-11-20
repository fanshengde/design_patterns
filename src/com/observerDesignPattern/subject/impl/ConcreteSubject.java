package com.observerDesignPattern.subject.impl;

import com.observerDesignPattern.observer.itf.Observer;
import com.observerDesignPattern.subject.itf.Subject;

/**
 * 一个具体主题总是实现主题接口，除了注册和撤销方法之外，具体主题还实现了notityObservers（）方法。
 */
public class ConcreteSubject implements Subject {
	private String state;

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub

	}

	/**
	 * notifyObservers（）方法，此方法用于在状态改变时更新所有当前观察者。
	 */
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub

	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
