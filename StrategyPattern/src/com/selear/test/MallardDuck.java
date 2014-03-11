package com.selear.test;

import com.selear.test.interf.Flyable;
import com.selear.test.interf.Quackable;

public class MallardDuck extends Duck implements Flyable, Quackable {

	void display() {
		// 外观是绿头
	}

	@Override
	public void fly() {
	}
	
	@Override
	public void quack() {
	}
}
