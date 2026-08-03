package collections;

import java.util.HashMap;

public class Prog9 {

	public static void main(String[] args) {
		HashMap<String, Car> hm = new HashMap<>();
		
		hm.put("Sam", new Car("Ford"));
		hm.put("Jo", new Car("BMW"));
		hm.put("Daphne", new Car("Skoda"));
		hm.put("Marty", new Car("DeLorean"));

		if(!hm.containsKey("Bob")) {
			hm.put("Bob", new Car("Ferrari"));
		}
		
		
		for (String key : hm.keySet()) {
			System.out.printf("%s drives a %s\n", key, hm.get(key).getModel());
		}
		
		for (Car car : hm.values()) {
			System.out.println(car.getModel());
		}
	}
}
