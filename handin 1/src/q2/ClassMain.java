package q2;

public class ClassMain {
	public static void main(String[] args) {
						
	Solvable ww = new Exam();
		if (ww.solve())
			System.out.println("Solved");
		else System.out.println("NOT Solved");
		
		if (ww.passed())
			System.out.println("Passed");
		else System.out.println("NOT Passed");		
	}
}