package Composition;

public class Wheel {

	private float inch;
	private String name;
	private boolean condition;
	
	public Wheel(String name,float inch,boolean condition) {
		this.name = name;
		this.condition=condition;
		System.out.println("A wheel is created: " + name + " and its size is : " + inch);
	}
	
	public void rotate(){
		System.out.println("Wheel is rotating.");
	}

	public float getInch() {
		return inch;
	}

	public void setInch(float inch) {
		this.inch = inch;
	}

	public boolean isCondition() {
		return condition;
	}

	public void setCondition(boolean condition) {
		this.condition = condition;
	}
	
	
	
	
}
