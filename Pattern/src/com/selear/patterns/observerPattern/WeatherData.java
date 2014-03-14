package com.selear.patterns.observerPattern;

public class WeatherData {

	public WeatherData() {
	}

	/*
	 * 1. 以下三个getter方法可用于取得三个测量值: 温度, 湿度和气压
	 */
	public float getTemperature() {
		return 0;
	}

	public float getHumidity() {
		return 0;
	}

	public float getPressure() {
		return 0;
	}

	/*
	 * 2. 每当气象测量数据有所更新, 则调用本方法
	 * --> 现在实现本方法
	 */
	public void measurementsChanged() {
		
		/*
		 * 假设三个getter方法能够帮助获取相关的数据
		 */
		float temp = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();
		
		/*
		 * 此处假设已存在三种公告板的变量, 并且公告板类中都具有update(temp, humidity, pressure)的方法
		 * 
		 * 为什么这样的代码编写是非常不规范的?
		 * 这种编写方式是'针对具体实现变成', 如今后需添加或删除布告板, 则必须修改本程序
		 * 		三个公告板都拥有update()方法, 因此可以抽象出update()方法, 参数分别是温度, 湿度和气压
		 */
		currentCoditionDisplay.update(temp, humidity, pressure);
		statisticsDisplay.update(temp, humidity, pressure);
		forecastDisplay.update(temp, humidity, pressure);
	}
	
}
