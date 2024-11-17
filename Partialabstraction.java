package com.jspiders.partialabstraction;
abstract class Alpha{
	abstract void play();
	void send() {
		System.out.println("Executing send()");
	}
}
class Beta extends Alpha{
	@Override
	void play() {
		System.out.println("Executing play()");
	}
}

public class mainclass2 {
	public static void main(String[] args) {
		Alpha obj=new Beta();
		obj.play();
		obj.send();
	}

}
