package com.selear.test;

import com.selear.test.behavior.impl.FlyNoWay;
import com.selear.test.behavior.impl.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	
	void display() {
		// 外观是橡皮鸭
	}
}
