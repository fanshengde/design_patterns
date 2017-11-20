package com.observerDesignPattern.notify.impl;

import com.observerDesignPattern.notify.itf.DisplayElement;
import com.observerDesignPattern.observer.itf.Observer;

public class ForecastDisplay implements Observer, DisplayElement{

	/**
	 * 此布告板根据气压计显示天气预报
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
