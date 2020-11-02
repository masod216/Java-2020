package q5;

public class D extends C {

	private double d;
	
	public D(int x, double y) {
		super(x);
		d = y;
	}
	
	public D() {
		d = 1.1;
	}

	public String getStr1() {
		String str = super.getStr ();
		str += " D: "; 
		str += d;
		return str;
	}
}
