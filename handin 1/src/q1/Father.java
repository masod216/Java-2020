package q1;

public class Father {
	private int a;
	
	public Father(int a) {
		this.a = a;
	}
	public Father() {
		this.a = 0;
	}
	
	public int getA() {
		return a;
	}
	public String toString() {
		String str = "a = " + getA();
		return str;
	}
}
