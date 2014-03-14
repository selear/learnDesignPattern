package com.selear.patterns.strategyPattern.subType;

import com.selear.patterns.strategy.Duck;
import com.selear.patterns.strategy.behavior.impl.FlyNoWay;
import com.selear.patterns.strategy.behavior.impl.MuteQuack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	public void display() {
		System.out.println("我是模型鸭.");
	}
}
