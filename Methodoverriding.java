package com.jspiders.overriding;
class Demo{
	void play() {
		System.out.println("Cricket");
		}
}
class Sample extends Demo{
	void play() {
		System.out.println("PUBG");
	}
}

public class mainclass1 {
	public static void main(String[] args) {
		Demo d=new Demo();
		d.play();
		Sample s=new Sample();
		s.play();
		Demo ref=new Sample();
		ref.play();
	}

}
