package collections;

enum Status {
	NEW,
	IN_PROGRESS,
	COMPLETED;
}

enum TrafficLight {
	RED,
	REDAMBER,
	AMBER,
	GREEN;
}

class Temp {
	public int s;
}

public class Prog {
	public static void main(String[] args) {
		/*
		int x = 42;
		int[] myArray = {20, 30, 40};
		System.out.println("x before: " + x);
		changeValueVariable(x);
		System.out.println("x after: " + x);
		System.out.println("myArray[1] before " + myArray[1]);
		changeReferenceVariable(myArray);
		System.out.println("myArray[1] after " + myArray[1]);
		*/
		Temp t = new Temp();
		t.s = 332;
		System.out.println("t.s before " + t.s);
		changeInstanceVar(t);
		System.out.println("t.s after " + t.s);
	}
	
	static void changeInstanceVar(Temp inst) {
		inst.s = 451;
	}
	
	static void changeValueVariable(int x) {
		x = 54;
	}
	static void changeReferenceVariable(int[] anArray) {
		anArray[1] = -99;
	}
	
	
	
	
	static Status getStatus() {
		return Status.IN_PROGRESS;
	}
	
	public static void explainLight(TrafficLight light) {
		switch (light) {
		case RED:
			System.out.println("Stop");
			break;
		case AMBER:
			System.out.println("Prepare to stop or get ready to go.");
			break;
		case GREEN:
			System.out.println("Go");
			break;
		}
	}
	
	static void doTask(Status status) {
		if(status == Status.NEW)
			System.out.println("Code for new.");
	}

}
