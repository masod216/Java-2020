package q5;

public class C {
	private int a;
	
	public C(int a) {
		this.a = a;
	}
	
	public C() {
		this.a = -1;
		
	}
	public final String getStr() {
		String str = "C: " + a;
		return str;
	}
}
