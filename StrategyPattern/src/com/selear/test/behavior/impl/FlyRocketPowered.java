package com.selear.test.behavior.impl;

import com.selear.test.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("乘坐火箭在飞.");
	}

}
