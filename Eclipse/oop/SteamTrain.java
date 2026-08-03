package oop;

public class SteamTrain extends Train {
	private int coalLevel;
	
	public SteamTrain(String name, int coalLevel) {
		super(name);
		this.coalLevel = coalLevel;
	}
	
	public SteamTrain(String name, int topSpeed, int trackLength, int position, int coalLevel) {
		super(name, topSpeed, trackLength, position);
		this.coalLevel = coalLevel;
	}
	
	public void specialClean() {
		System.out.println("Cleaning specific to a steam train.");
	}
	
	public int getCoalLevel() {
		return this.coalLevel;
	}
	
	public void whistle() {
		System.out.println("Whoo whoo!");
	}
}
