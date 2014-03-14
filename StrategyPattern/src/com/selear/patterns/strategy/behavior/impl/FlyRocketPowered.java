package com.selear.patterns.strategy.behavior.impl;

import com.selear.patterns.strategy.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("乘坐火箭在飞.");
	}

}
