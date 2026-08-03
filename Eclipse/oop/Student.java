package oop;

public class Student {
	public static int count = 0;
	private String name;
	
	public Student(String name) {
		this.name = name;
		count++;
	}
}
