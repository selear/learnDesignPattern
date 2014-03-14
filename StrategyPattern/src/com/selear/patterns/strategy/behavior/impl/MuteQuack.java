package com.selear.patterns.strategy.behavior.impl;

import com.selear.patterns.strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		//什么都不做, 保持沉默
		System.out.println("<< 沉默 >>");
	}

}
