package methods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tools {
	
	public static String getString(String prompt) {
		Scanner s = new Scanner(System.in);
		System.out.println(prompt);
		String str = s.nextLine();
		return str;
	}
	
	public static int getInt(String prompt) {
		Scanner s = new Scanner(System.in);
		System.out.println(prompt);
		int i;
		try {
			i = s.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Exception: " + e.getMessage());
			throw new InputMismatchException("Wrong input type!");
		}
		return i;
	}

}
