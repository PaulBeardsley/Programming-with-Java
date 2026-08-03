package collections;

public class Prog3 {

	public static void main(String[] args) {
		Chair a = new Chair();	// object 1
		Chair b = new Chair();	// object 2
		Chair c = a;
		a = b;
		c = null;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}

class Chair {}
