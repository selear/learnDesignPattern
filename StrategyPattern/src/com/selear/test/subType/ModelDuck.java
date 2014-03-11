package com.selear.test.subType;

import com.selear.test.Duck;
import com.selear.test.behavior.impl.FlyNoWay;
import com.selear.test.behavior.impl.MuteQuack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	public void display() {
		System.out.println("我是模型鸭.");
	}
}
