package com.selear.test.subType;

import com.selear.test.Duck;
import com.selear.test.behavior.impl.FlyWithWings;
import com.selear.test.behavior.impl.Quack;

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
