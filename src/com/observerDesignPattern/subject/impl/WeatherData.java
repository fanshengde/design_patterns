package com.observerDesignPattern.subject.impl;


import java.util.ArrayList;

import com.observerDesignPattern.observer.itf.Observer;
import com.observerDesignPattern.subject.itf.Subject;

public class WeatherData implements Subject{

	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	
	
	/**
	 * 以下三个变量如何设置不用设置数据，WeatherData对象可以从气象站获取更新信息。
	 * getTemperature()
	 * getHumidity()
	 * getPressure()
	 * 
	 * 
	 * */
	public float getTemperature() {
		return temperature;
	}
	
	
	public float getHumidity() {
		return humidity;
	}
	
	public float getPressure() {
		return pressure;
	}
	
	
	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}


	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i);
		}
	}


	@Override
	public void notifyObservers() {
		for(int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

}
