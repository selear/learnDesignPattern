package com.selear.test;

import com.selear.test.behavior.impl.FlyWithWings;
import com.selear.test.behavior.impl.Quack;

public class MallardDuck extends Duck{

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	void display() {
		// 外观是绿头
	}
}
