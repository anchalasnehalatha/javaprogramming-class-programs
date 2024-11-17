package com.jspiders.inheritance2;
class A{
	void test() {
		System.out.println("Test()");
	}
}
class B extends A{
	void disp() {
		System.out.println("disp()");
	}
}
class C extends B{
	void play() {
		System.out.println("play()");
	}
}


public class mainclass3 {
	public static void main(String[] args) {
		A a1=new A();
		a1.test();
		B b1=new B();
		b1.test();
		b1.test();
		C c1=new C();
		c1.test();
		c1.disp();
		c1.play();
	}

}
