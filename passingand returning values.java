package com.jspiders.passandreturnvalues;

 class Biriyani {
	String name;
	int qty;
	double price;
	Biriyani(String n,int q,double p){
		name=n;
		qty=q;
		price=p;
	}

}
public class Hotel {
	static void display(Biriyani b) {
		System.out.println("Name :" +b.name);
		System.out.println("Qty :" +b.qty);
		System.out.println("Price :" +b.price);
	}
	static Biriyani create() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Quantity :");
		int q=sc.nextInt();
		System.out.println("Price :");
		double p=sc.nextDouble();
		System.out.println("Name :");
		String n=sc.next();
		Biriyani b=new Biriyani(n,q,p);
		return b;
	}

}


public class mainclass2 {
	public static void main(String[] args) {
		Biriyani b1=Hotel.create();
		Biriyani b2=Hotel.create();
		Biriyani b3=Hotel.create();
		Hotel.display(b1);
		Hotel.display(b2);
		Hotel.display(b3);
		
	}

}

