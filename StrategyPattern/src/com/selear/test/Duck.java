package com.selear.test;

public class Duck {

	// 所有鸭子都会呱呱叫
	//-->通过接口来实现quack()方法
	/*void quack() {
	}*/

	// 所有的鸭子都会游泳
	void swim() {
	}

	// 每一种鸭子的外观都不同, 因此display()方法是抽象的
	void display() {
	}

	// 我们希望鸭子能飞,所有的子类都会继承fly()方法
	// -->并非所有的鸭子都会飞, 比如继承该超类的橡皮鸭
	// -->通过接口来实现fly()方法
	/*
	 * void fly() { }
	 */
}
