package collections;

public class Prog2 {

	public static void main(String[] args) {
		String s1 = "sandcastle";
		String s2 = "sandcastle";
		String s3 = new String("sandcastle");
		String s4 = new String("sandcastle");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		
		System.out.println("***");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);


	}

}
