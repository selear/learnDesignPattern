package com.selear.test;

import com.selear.test.behavior.impl.FlyWithWings;
import com.selear.test.behavior.impl.Quack;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	void display() {
		// 外观是红头
	}
}
