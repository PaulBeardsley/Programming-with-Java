package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Prog8 {

	public static void main(String[] args) {
		
		Deque<String> stack = new ArrayDeque<>();
		Deque<String> a = new ArrayDeque<>();
		Deque<String> b = new ArrayDeque<>();
		
		stack.push("One");
		stack.push("Two");
		stack.push("Three");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		a.push("Alpha");
		a.push("Beta"));
		a.push("Gamma");
		
		b.push(a.pop());
		b.push(a.pop());
		b.push(a.pop());

	}

}
