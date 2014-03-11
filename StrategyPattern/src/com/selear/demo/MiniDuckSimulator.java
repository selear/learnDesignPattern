package com.selear.demo;

import com.selear.test.Duck;
import com.selear.test.behavior.impl.FlyRocketPowered;
import com.selear.test.subType.MallardDuck;
import com.selear.test.subType.ModelDuck;

public class MiniDuckSimulator {
	
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		System.out.println("==========");
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
