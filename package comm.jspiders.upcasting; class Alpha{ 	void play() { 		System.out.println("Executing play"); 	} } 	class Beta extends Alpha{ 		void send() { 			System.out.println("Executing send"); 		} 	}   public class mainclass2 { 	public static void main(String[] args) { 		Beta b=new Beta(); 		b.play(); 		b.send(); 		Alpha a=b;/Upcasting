package comm.jspiders.upcasting;
class Alpha{
	void play() {
		System.out.println("Executing play");
	}
}
	class Beta extends Alpha{
		void send() {
			System.out.println("Executing send");
		}
	}


public class mainclass2 {
	public static void main(String[] args) {
		Beta b=new Beta();
		b.play();
		b.send();
		Alpha a=b;//upcasting from beta---->alpha
		a.play();
	}

}
