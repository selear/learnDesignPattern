package com.selear.patterns.observer.interf.impl;

import com.selear.patterns.observer.interf.DisplayElement;
import com.selear.patterns.observer.interf.Observer;
import com.selear.patterns.observer.interf.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData; // 为什么要保存Subject的引用, 构造函数完成之后用不到该变量了? A:
										// 也有可能会想要取消注册, 如果已经有了对Subject的引用会比较方便
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature
				+ "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display(); // 数据更新之后, 立即调用显示方法, 将获取到的数据显示出来
	}

}
