package oop;

public class Prog {

	public static void main(String[] args) {
		
		Train t1 = new Train("Thomas", 120);
		Train t2 = new Train("Edward", 110);
		Train t3 = null;
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		/*
		t1.move(250);
		t1.move(-10);
		t2.move(50);
		t2.move(-970);
		
		System.out.println(t1.getName() + " is at " + t1.getPosition());
		System.out.println(t2.getName() + " is at " + t2.getPosition());
		*/
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.x = 111;
		c1.y = 101;
		
		c2.x = 222;
		c2.y = 202;
		
		System.out.println(c1.x);
		System.out.println(c1.y);

		//Car.drive();
		
		
		Car myCar = getPoolCar();
		if(myCar != null)
			myCar.drive();
		else
			System.out.println("Sorry, we're all out of pool cars.");


	}
	
	static Car getPoolCar() {
		Car hireCar = new Car();
		//Car hireCar = null;
		
		return hireCar;
	}

}
