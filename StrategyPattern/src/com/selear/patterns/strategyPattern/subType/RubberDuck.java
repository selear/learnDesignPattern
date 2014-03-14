package com.selear.patterns.strategyPattern.subType;

import com.selear.patterns.strategy.Duck;
import com.selear.patterns.strategy.behavior.impl.FlyNoWay;
import com.selear.patterns.strategy.behavior.impl.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		quackBehavior = new Squeak();
		flyBehavior = new FlyNoWay();
	}
	
	public void display() {
		System.out.println("我是橡皮鸭.");
	}
}
