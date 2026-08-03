package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Prog7 {
	public static void main(String[] args) {
		Queue<Car> carsQ = new LinkedList<>();
		
		carsQ.add(new Car("Ford"));
		carsQ.add(new Car("Honda"));
		carsQ.add(new Car("BMW"));
		
		while(!carsQ.isEmpty()) {
			Car car = carsQ.poll();
			System.out.println(car.getModel());
		}
	}
}
