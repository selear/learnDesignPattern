package com.selear.test.behavior.impl;

import com.selear.test.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		//橡皮鸭子的吱吱叫
		System.out.println("吱吱吱");
	}

}
