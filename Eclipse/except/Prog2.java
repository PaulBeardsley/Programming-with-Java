package except;

public class Prog2 {

	public static void main(String[] args) {
		int[] ages = new int[7];
		processAges(ages);
	}
	
	static void processAges(int[] ages) {
		try {
			System.out.println("Last index is " + ages[7]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}

}
