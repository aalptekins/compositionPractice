package Composition;


public class Bicycle {

	private String brand;
	private String color;
	private int year;
	private int speed;
	private int distance;
	
	private Wheel[] wheels = new Wheel[2];

	private Pedal pedal;
	
	public Bicycle(String brand, String color, int year) {
		this.brand = brand;
		this.color = color;
		this.year = year;
		
		pedal = new Pedal(true);

		wheels[0] = new Wheel("Front",21,true);
		wheels[1] = new Wheel("Rear",21,true);
		
		
		System.out.println("A bicycle of " + brand  + ", " + year + " is created.\n");
		
		

	}
	
	public void go(int newDistance) {
		if(pedal.getCondition() && wheels[0].isCondition() && wheels[1].isCondition() ) {
		System.out.println("Car is moving.");
		distance += newDistance;
		System.out.println("Distance: " + distance);}
		else
			System.out.println("There are some problems. You cant go!!!");
	}

	public void accelerate(int newSpeed) {
		this.speed = newSpeed;
		System.out.println("Accelerating. New speed: " + speed);
	}



	public String getInfo() {
		return "Bicycle Info: " + year + " " + brand + ". Distance: " + distance + " km. and traveling at "
				+ speed + " kmph.";
	}
	
	
	
	
}
