package com.jspiders.methods;
class OneTimePassword{
	int otp=4375;
	@Override
	public boolean equals(Object obj) {
		OneTimePassword otp=(OneTimePassword)obj;
		if(this.otp==otp.otp) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class mainclass2 {
	public static void main(String[] args) {
		OneTimePassword otp1=new OneTimePassword();
		OneTimePassword otp2=new OneTimePassword();
		System.out.println(otp1.equals(otp2));
	}

}
