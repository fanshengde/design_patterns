package com.observerDesignPattern.notify.impl;

import com.observerDesignPattern.notify.itf.DisplayElement;
import com.observerDesignPattern.observer.itf.Observer;

/**
 * 开发人员可以实现观察者和显示借口穿件自己的布告板
 * */
public class ThirdPartyDisplay implements Observer,DisplayElement{

	/**
	 * 显示基于观测值的其他内容
	 * */
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		
	}



}
