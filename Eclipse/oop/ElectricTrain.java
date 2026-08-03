package oop;

public class ElectricTrain extends Train {

	private int brushShininess;
	
	public void specialClean() {
		System.out.println("Cleaning specific to an electric train.");
	}
	
	public ElectricTrain(String name, int brushShininess) {
		super(name);
		this.brushShininess = brushShininess;
	}
	
	public ElectricTrain(String name, int topSpeed, int trackLength, int position, int brushShininess) {
		super(name, topSpeed, trackLength, position);
		this.brushShininess = brushShininess;
	}
	
	public void inspectMotor() {
		System.out.println("Examining the coils and magnets.");
	}
	
	public int getBrushshininess() {
		return this.brushShininess;
	}
}
