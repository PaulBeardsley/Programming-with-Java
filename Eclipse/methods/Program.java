package methods;


public class Program {

	public static void main(String[] args) {
		/*
		int num = 123456;
		System.out.printf("##%d##\n", num);
		System.out.printf("##%8d##\n", num);
		System.out.printf("##%08d##\n", num);
		System.out.printf("##%+8d##\n", num);
		System.out.printf("##%,d##\n", num);
		System.out.printf("##%,+12d##\n", num);
		*/
		
		double d = 560;
		double switch2 = 345;
		
		System.out.printf("I made £%.2f on Sunday!\nI still had £%.2f after buying a Switch 2 for £%.2f!\n", d, d-switch2, switch2);
		
		
		String message = String.format(
				"Hello %s. I live at %d %s\n", "Sam", 23, "Fake Street"
				);
		System.out.println(message);

	}

}
