package practis1.a;

public class Bird extends Animal{
	
	public Bird(double w) {
		
		super(w);	
		System.out.println("In Constructor of Bird with argument " + w);
	}
	
	public void fly(double speed) {
		setWeight(getWeight() - 0.01*speed);
	}
}