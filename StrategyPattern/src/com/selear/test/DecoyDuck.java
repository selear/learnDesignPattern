package com.selear.test;

public class DecoyDuck extends Duck {

	void quack() {
		// 覆盖, 诱饵鸭不能发出叫声
	}

	void display() {
		// 诱饵鸭
	}

	void fly() {
		// 覆盖，诱饵鸭不能飞
	}
}
