package com.observerDesignPattern;

import com.observerDesignPattern.notify.impl.CurrentConditionsDisplay;
import com.observerDesignPattern.subject.impl.WeatherData;

public interface WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
		
//		StatisicsDisplay statisicsDisplay = new StatisicsDisplay(weatherData);
//		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80,65,30.4f);
		weatherData.setMeasurements(82,70,30.2f);
		weatherData.setMeasurements(10,90,10.2f);
		
	}
}
