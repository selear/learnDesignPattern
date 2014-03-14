package com.selear.demos.strategyPattern;

import com.selear.patterns.strategy.Duck;
import com.selear.patterns.strategy.behavior.impl.FlyRocketPowered;
import com.selear.patterns.strategyPattern.subType.MallardDuck;
import com.selear.patterns.strategyPattern.subType.ModelDuck;

//这是策略模式的运行Demo
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
