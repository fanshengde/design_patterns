package com.observerDesignPattern.observer.impl;

import com.observerDesignPattern.observer.itf.Observer;

/**
 * 具体的观察者可以是实现此借口的任意类。观察者必须注册具体主题，以便接受更新。
 * */

public class ConcreteObserver implements Observer{

	@Override
	public void update(float temp, float humidity, float pressure) {
		
	}

}
