package methods;

public class Prog3 {

	public static void main(String[] args) {
		Parent o = new Child();
		
		System.out.println(o.name);
		
		o.myMethod();
		((Child)o).myMethod(42);
	}
}

class Parent {
	String name = "Super";
	public void myMethod() {
		System.out.println("Inside Parent.");
	}
}

class Child extends Parent {
	String name = "Sub";
	@Override
	public void myMethod() {
		System.out.println("Inside Child.");
	}

	public void myMethod(int i) {	// doesn't actually override; it overLOADs
		System.out.println(i);
	}
}