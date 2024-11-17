package com.jspiders.pureabstraction;
interface Demo{
	void test();
}
class Sample implements Demo{
	@Override
	public void  test() {
		System.out.println("Executing test()");
	}
}

public class mainclass1 {
public static void main(String[] args) {
	Demo ref=new Sample();
	ref.test();
}
}
