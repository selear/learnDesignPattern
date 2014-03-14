package com.selear.patterns.observerPattern;

import java.util.ArrayList;

import com.selear.patterns.observerPattern.interf.Observer;
import com.selear.patterns.observerPattern.interf.Subject;

public class WeatherData implements Subject {

	private ArrayList<Observer> observers;	//用于记录观察者
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		//注册观察者
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		//删除观察者
		int i = observers.indexOf(o);
		observers.remove(i);
	}

	@Override
	public void notifyObservers() {
		//将状态告诉每一个观察者
		for(Observer o : observers) {
			o.update(temperature, humidity, pressure);
		}
	}
	
	/*
	 * 1. 以下三个getter方法可用于取得三个测量值: 温度, 湿度和气压
	 */
	public float getTemperature() {
		return this.temperature;
	}

	public float getHumidity() {
		return this.humidity;
	}

	public float getPressure() {
		return this.pressure;
	}

	/*
	 * 2. 每当气象测量数据有所更新, 则调用本方法
	 * 	-->现在实现本方法, 本方法的第一个代码实现版本原先就有错
	 * 	-->二次修正本方法
	 */
	public void measurementsChanged() {
		//每当从气象站获得更新的观测值时, 通知观察者
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();	//每当成功设置新的温度, 湿度, 气压数据之后, 则表示数据已经进行了更新
	}

}
