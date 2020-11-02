package q1;

public class Son extends Father {
	private double b;
	
	public Son(double b)
	{
		this.b = b;
	}
	public Son() {
		super(2);
		b = 3.5;
	}
	public double getB() {
		return b;
	}
	public String toString() {
		String str = "a = " + getA() + " b = " + getB();
		return str;
	}
}
