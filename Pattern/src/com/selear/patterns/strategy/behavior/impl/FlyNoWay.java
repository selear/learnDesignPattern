package com.selear.patterns.strategy.behavior.impl;

import com.selear.patterns.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		//不会飞, 什么都不做\
		System.out.println("我飞不起来.");
	}

}
