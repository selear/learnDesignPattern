package com.selear.test.behavior.impl;

import com.selear.test.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		//什么都不做, 保持沉默
	}

}
