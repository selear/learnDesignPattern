package com.selear.test;

import com.selear.test.interf.Flyable;
import com.selear.test.interf.Quackable;

public class RedheadDuck extends Duck implements Flyable, Quackable {

	void display() {
		// 外观是红头
	}

	@Override
	public void quack() {
	}

	@Override
	public void fly() {
	}
}
