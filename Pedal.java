package Composition;

public class Pedal {
	
	private boolean condition;
	
	Pedal(boolean condition){
		this.condition = condition;
		if(condition)
			System.out.println("A pedal is added to bicycle and its condition is fine.");
		else
			System.out.println("There are some problems about pedal of bicycle. You shouldnt drive it.");
	}
	public boolean getCondition() {
		return condition;
	}
	public void setCondition(boolean condition) {
		this.condition=condition;
	}

}
