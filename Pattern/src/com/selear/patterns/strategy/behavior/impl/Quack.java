package com.selear.patterns.strategy.behavior.impl;

import com.selear.patterns.strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		//实现鸭子的呱呱叫
		System.out.println("呱呱呱.");
	}

}
