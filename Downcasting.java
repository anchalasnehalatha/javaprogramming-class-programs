package com.jspiders.downcasting;
class Demo{
	
}
class Sample extends Demo{
	
}

public class mainclass1 {
	public static void main(String[] args) {
		Demo ref=new Sample();//Downcasting:Demo-->sample
		Sample obj=(Sample)ref;
		System.out.println(ref);
		System.out.println(obj);
	}

}
