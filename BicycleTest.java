package Composition;

public class BicycleTest {

	public static void main(String[] args) {
		Bicycle b1 = new Bicycle("Salcano", "Red", 2016);
		b1.accelerate(100);
		b1.accelerate(50);
		
		b1.go(60);
		b1.getInfo();
	}

}
