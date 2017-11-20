package com.observerDesignPattern.observer.itf;


public interface Observer {

	/**
	 * 所有的观察者都必须实现观察者接口，这个借口只有update（）方法，以实现观察者接口。
	 * 
	 * 当气象观察值改变时，主题会把这些状态值当做方法的参数，传递给观察者。
	 * */
	public void update(float temp, float humidity, float pressure);
}
