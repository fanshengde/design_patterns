package com.observerDesignPattern.notify.impl;

import com.observerDesignPattern.notify.itf.DisplayElement;
import com.observerDesignPattern.observer.itf.Observer;

/**
 * 此布告板总最小，平均、最大的观测值，并显示他们
 * */
public class StatisicsDisplay implements Observer, DisplayElement{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		
	}


}
