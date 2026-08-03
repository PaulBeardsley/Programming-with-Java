package methods;

public class Prog2 {

	public static void main(String[] args) {
		int[] fib = {1,1,2,3,5};
		
		for(int i = 0; i < fib.length; i++) {
			System.out.println(fib[i]);
			if(fib[i] == 3)
				fib[i] = 30;
		}
		System.out.println("Done");
		for(int i = 0; i < fib.length; i++) {
			System.out.println(fib[i]);
		}
		System.out.println("Done");
		for(int n : fib) {
			System.out.println(n);
			if(n == 2)
				n = 20;
		}
		System.out.println("Done");
		for(int n : fib) {
			System.out.println(n);
		}
		System.out.println("Done");
	}
}
