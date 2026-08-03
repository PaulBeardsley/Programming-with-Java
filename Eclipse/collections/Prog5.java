package collections;

import java.util.ArrayList;
import java.util.List;

public class Prog5 {

	public static void main(String[] args) {
		List<String> friends = new ArrayList<>();

		friends.add("Monica");
		friends.add("Chandler");
		friends.add("Rachel");
		friends.add("Ross");
		
		friends.add(2, "Phoebe");
		friends.add("Joseph");
		friends.set(5,  "Joey");
		
		for (String friend : friends) {
			System.out.println(friend);
		}
		System.out.println("***");
		for (int i = 0; i < friends.size(); i++) {
			System.out.println(friends.get(i));
		}
		System.out.println("***");
	}
}

class Fan {
	int speed;
	boolean oscillate;
}
