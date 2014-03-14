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
	 */
	public void measurementsChanged() {
		// Code
	}

	/*
	 * 实现三个使用天气数据的布告板: 目前状态, 气象统计, 天气预报 一旦WeatherData有新的测量数据, 这些布告必须马上更新
	 */

	/*
	 * 本系统必须方便扩展, 可让其他开发人员建立制定的布告板, 用户可以随心所欲添加删除任何布告板.
	 */
}
