package com.jspiders.inheritance;
class Demo{
	int val=10;
	void test() {
		System.out.println("Executing test method");
	}
}
class Sample extends Demo{
}


public class mainclass1 {
	public static void main(String[] args) {
		Sample s=new Sample();
		System.out.println(s.val);
		s.test();
		
	}

}
