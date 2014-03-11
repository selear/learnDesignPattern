package com.selear.test;

import com.selear.test.behavior.impl.FlyNoWay;
import com.selear.test.behavior.impl.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	
	public void display() {
		System.out.println("我是橡皮鸭.");
	}
}
