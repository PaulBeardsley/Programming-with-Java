package oop;

public abstract class Train implements PublicTransport {
	private String name;
	private int topSpeed;
	private int trackLength;
	private int position;
	
	public void receivePassenger() {
		System.out.println("Find yourself a seat.");
	}
	
	public Train(String name) {
		this(name, 50);
	}
	
	public Train(String name, int topSpeed) {
		this(name, topSpeed, 100, 0);
	}
	
	public Train(String name, int topSpeed, int trackLength, int position) {
		this.name = name;
		this.topSpeed = topSpeed;
		this.trackLength = trackLength;
		this.position = position;
	}
	
	public void generalClean() {
		System.out.println("Make it shiny inside and out!");
	}
	
	public abstract void specialClean();
	
	public void move(int distance) {
		if(distance > this.topSpeed)
			distance = this.topSpeed;
		if(distance < -this.topSpeed)
			distance = -this.topSpeed;
		
		this.position += distance;
		
		if(this.position < 0)
			this.position = 0;
		if(this.position > this.trackLength)
			this.position = this.trackLength;
		
	}
	
	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}
	
	public String getName() {
		return this.name;
	}

	public int getTopSpeed() {
		return this.topSpeed;
	}
	public int getPosition() {
		return this.position;
	}
}
