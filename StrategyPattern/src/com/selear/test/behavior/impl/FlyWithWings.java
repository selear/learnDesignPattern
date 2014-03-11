package com.selear.test.behavior.impl;

import com.selear.test.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		//实现鸭子的飞行动作
		System.out.println("我正在飞.");
	}

}
