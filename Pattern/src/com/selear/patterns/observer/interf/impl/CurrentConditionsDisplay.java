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
				+ "F degrees\n" + humidity + "% humidity\nHeat index: " + computeHeatIndex(temperature, humidity));
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display(); // 数据更新之后, 立即调用显示方法, 将获取到的数据显示出来; 而update()方法的调用,
					// 则是在Subject类中通过得带存储的观察者列表执行update()来完成
	}

	private float computeHeatIndex(float t, float rh) {
		float index = (float) ((16.923 + (0.185212 * t) + (5.37941 * rh)
				- (0.100254 * t * rh) + (0.00941695 * (t * t))
				+ (0.00728898 * (rh * rh)) + (0.000345372 * (t * t * rh))
				- (0.000814971 * (t * rh * rh))
				+ (0.0000102102 * (t * t * rh * rh))
				- (0.000038646 * (t * t * t)) + (0.0000291583 * (rh * rh * rh))
				+ (0.00000142721 * (t * t * t * rh))
				+ (0.000000197483 * (t * rh * rh * rh))
				- (0.0000000218429 * (t * t * t * rh * rh)) + 0.000000000843296 * (t
				* t * rh * rh * rh)) - (0.0000000000481975 * (t * t * t * rh
				* rh * rh)));
		return index;
	}
}