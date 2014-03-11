package com.selear.test.subType;

import com.selear.test.Duck;
import com.selear.test.behavior.impl.FlyNoWay;
import com.selear.test.behavior.impl.MuteQuack;

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
