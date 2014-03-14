package com.selear.patterns.strategyPattern.subType;

import com.selear.patterns.strategy.Duck;
import com.selear.patterns.strategy.behavior.impl.FlyWithWings;
import com.selear.patterns.strategy.behavior.impl.Quack;

public class MallardDuck extends Duck{

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	
	public void display() {
		// 外观是绿头
		System.out.println("我是绿头鸭.");
	}
}
