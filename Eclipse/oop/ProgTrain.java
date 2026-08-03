package oop;

public class ProgTrain {

	public static void main(String[] args) {
		
		PublicTransport[] fleet = {		
				new SteamTrain("Thomas", 97),
				new SteamTrain("Susan", 55, 200, 80, 58),
				new ElectricTrain("Philip", 95),
				new ElectricTrain("Harvey", 150, 300, 200, 30),
				new Taxi(),
				new Bus()
		};
		
		for(PublicTransport vehicle : fleet) {
			if(vehicle instanceof Train)
				((Train)vehicle).move(20);
		}
		
		/*
		for(Train train : fleet) {
			if (train instanceof SteamTrain)
				((SteamTrain)train).whistle();
			else if (train instanceof ElectricTrain)
				((ElectricTrain)train).inspectMotor();
			else
				System.out.println("Unexpected.");
			System.out.println(train.getPosition());
		}
		
		Car c = new AgentCar();
		Train t = new ElectricTrain("Cuthbert", 20);
		
		System.out.println(c instanceof Car);
		System.out.println(c instanceof AgentCar);
		System.out.println(c instanceof Taxi);
		System.out.println("***");
		System.out.println(t instanceof Train);
		System.out.println(t instanceof ElectricTrain);
		System.out.println(t instanceof SteamTrain);
		
		System.out.println(t instanceof Taxi);
		*/
	}

}
