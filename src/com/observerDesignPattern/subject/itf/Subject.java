package com.observerDesignPattern.subject.itf;

import com.observerDesignPattern.observer.itf.Observer;

/**
 * 这个类是主题接口，对象使用此借口注册为观察者，或者删除从观察者行列删除。
 * */

public interface Subject {
	
	/**
	 * 下面的俩个方式需要一个观察者作为变量，该观察者是用来注册或者被删除
	 * */
	public void registerObserver(Observer o);

	public void removeObserver(Observer o);

	/**
	 * 当主题状态改变时，这个方法会被调用，以通知所有的观察者
	 * */
	public void notifyObservers();
}
