package oop;

public class Boat {
	private int size;
	
	public Boat(int size) {
		this.size = size;
		System.out.println("Inside the one parameter constructor.");
	}
	
	public Boat() {
		this(10);
		System.out.println("Inside the zero parameter constructor.");
	}
	
	public void Boat() {
		System.out.println("Who needs a boat?");
	}
	
	public int getSize() {
		return this.size;
	}
	
	/*
	public void setSize(int size) {
		this.size = size;
	}
	*/
}
