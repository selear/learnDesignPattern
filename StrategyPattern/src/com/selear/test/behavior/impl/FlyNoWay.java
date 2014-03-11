package com.selear.test.behavior.impl;

import com.selear.test.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		//不会飞, 什么都不做\
		System.out.println("我飞不起来.");
	}

}
