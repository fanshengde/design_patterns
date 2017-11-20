package com.observerDesignPattern.notify.impl;

import com.observerDesignPattern.notify.itf.DisplayElement;
import com.observerDesignPattern.observer.itf.Observer;
import com.observerDesignPattern.subject.itf.Subject;

/**
 * 此布告版根据weather data 对象显示当前观测值
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;

	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + " : F degrees and " + humidity + " % humidity");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

}
