package collections;

public class Prog4 {

	public static void main(String[] args) {
		String s = "Fred";
		
		for(int i = 0; i < 3; i++) {
			s += "a";
		}
		System.out.println(s);
		StringBuilder sb = new StringBuilder("Fred");
		for(int i = 0; i < 300; i++) {
			sb.append("a");
		}
	}
}
