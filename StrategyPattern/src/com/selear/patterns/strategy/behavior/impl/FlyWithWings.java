package com.selear.patterns.strategy.behavior.impl;

import com.selear.patterns.strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		//实现鸭子的飞行动作
		System.out.println("我正在飞.");
	}

}
