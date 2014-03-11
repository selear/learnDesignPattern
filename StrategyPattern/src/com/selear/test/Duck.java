package com.selear.test;

import com.selear.test.behavior.FlyBehavior;
import com.selear.test.behavior.QuackBehavior;

public class Duck {

	//在超类中添加接口的引用, 在子类中引用不同的实例, 以此来完成子类不同行为的表现
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	// 所有的鸭子都会游泳
	void swim() {
	}

	// 每一种鸭子的外观都不同, 因此display()方法是抽象的
	void display() {
	}
	
	//表示该类可以进行飞行, 具体的飞行方法的调用, 由根据具体类来实现
	void performFly() {
		flyBehavior.fly();
	}
	
	//同上, 简单来说, 是鸭子都会叫, 都会飞; 至于怎么叫, 怎么飞, 每种鸭子都有不同的情况
	void performQuack() {
		quackBehavior.quack();
	}
	
}
