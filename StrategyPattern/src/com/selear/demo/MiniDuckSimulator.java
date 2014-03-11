package com.selear.demo;

import com.selear.test.Duck;
import com.selear.test.MallardDuck;

public class MiniDuckSimulator {
	
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
	}
}
