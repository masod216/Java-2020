package q4;

public class MyClass {

	private static int x;
	private static double y;
	
	public MyClass() {
		x = 2;
		y = 3.5;
	}
	
	public void updateValues(int x, double y) {
		this.x = x;
		this.y = y;
	}
	public static void print() {
		System.out.println(x);
		System.out.println(y);		
	}
}
