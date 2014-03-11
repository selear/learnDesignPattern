package com.selear.test.subType;

import com.selear.test.Duck;
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
