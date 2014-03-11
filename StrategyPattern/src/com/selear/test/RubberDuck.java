package com.selear.test;

public class RubberDuck extends Duck {

	void quack() {
		//覆盖为吱吱叫
	}
	
	void display() {
		//外观是橡皮鸭
	}
	
	void fly() {
		//橡皮鸭不会飞, 只能选择覆盖该方法, 但什么事情都不做
	}
}
