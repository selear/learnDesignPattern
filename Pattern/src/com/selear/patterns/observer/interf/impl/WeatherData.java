package com.selear.patterns.observer.interf.impl;

import java.util.Observable;

public class WeatherData extends Observable {

	// private ArrayList<Observer> observers; // 用于记录观察者, 因为继承了Java自带的观察者模式的类,
	// 因此本代码可以注释
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
	}

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
		// 调用本方法, 但没有传递数据对象, 表示通过观察者主动获取数据对象
		setChanged();
		// 每当从气象站获得更新的观测值时, 通知观察者
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity,
			float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged(); // 每当成功设置新的温度, 湿度, 气压数据之后, 则表示数据已经进行了更新
	}

}
