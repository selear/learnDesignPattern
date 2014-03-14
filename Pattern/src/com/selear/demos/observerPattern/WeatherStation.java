package com.selear.demos.observerPattern;

import com.selear.patterns.observer.interf.impl.CurrentConditionsDisplay;
import com.selear.patterns.observer.interf.impl.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		// 在观察者的构造方法中, 使用Subject作为参数执行构造方法的, 都会自动执行注册观察者方法,
		// 将自身注册到到Subject的观察者队列之中
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(
				weatherData);
		//StatisticsDisplay statisticsDisplay = new StatisticsDispaly();
		//ForecastDisplay forecastDisplay = new ForecastDisplay();
		weatherData.setMeasurements(80, 65, 30.4f);
	}
}