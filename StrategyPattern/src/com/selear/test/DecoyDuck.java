package com.selear.test;

import com.selear.test.behavior.impl.FlyNoWay;
import com.selear.test.behavior.impl.MuteQuack;

public class DecoyDuck extends Duck {

	//子类创建实例时, 对接口变量进行动态赋值
	public DecoyDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}
	
	void display() {
		// 诱饵鸭
	}
}
