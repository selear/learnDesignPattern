package com.selear.test;

import com.selear.test.behavior.impl.FlyWithWings;
import com.selear.test.behavior.impl.Quack;

public class RedheadDuck extends Duck {

	public RedheadDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		// 外观是红头
		System.out.println("我是红头鸭.");
	}
}
