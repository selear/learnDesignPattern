package com.selear.patterns.strategyPattern.subType;

import com.selear.patterns.strategy.Duck;
import com.selear.patterns.strategy.behavior.impl.FlyNoWay;
import com.selear.patterns.strategy.behavior.impl.MuteQuack;

public class DecoyDuck extends Duck {

	//子类创建实例时, 对接口变量进行动态赋值
	public DecoyDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	public void display() {
		// 诱饵鸭
		System.out.println("我是诱饵鸭.");
	}
}
