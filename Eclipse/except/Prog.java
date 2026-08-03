package except;

import methods.Tools;

public class Prog {
	public static void main(String[] args) {
		int cakes;
		int people;
		
		try {
			cakes = Tools.getInt("How many cakes are there? ");
			people = Tools.getInt("How many people are eating cakes? ");
			System.out.println("There are " + (cakes/people) + " cakes per person.");
		}
		catch(ArithmeticException e) {
			System.out.println("Exception: " + e.getMessage());
		}
		catch(Exception e) {
			System.out.println("An unexpected exception. " + e.getMessage());
		}
		finally {
			System.out.println("Thank you for using Cake-U-Lator (TM).");
		}
	}
}
