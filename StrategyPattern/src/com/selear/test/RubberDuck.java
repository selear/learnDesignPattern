package com.selear.test;

import com.selear.test.interf.Quackable;

public class RubberDuck extends Duck implements Quackable {

	void display() {
		//外观是橡皮鸭
	}

	@Override
	public void quack() {
		//重写方法来自于接口, 而非来自原先的超类之中的方法
	}
	
	// 不继承Flyable接口, 则表示橡皮鸭不会飞
}
