package oop;

public class Taxi extends Car implements PublicTransport {
	public void receivePassenger() {
		System.out.println("Where to, guv?");
	}
}
