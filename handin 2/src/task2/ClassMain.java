package task2;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		DeptChair d1 = new DeptChair("bob", "comp", 5, "boxing", 5, 68, 2018);
		Professor p1 = new Professor("as", "math", 4, "life", 2, 53);
		d1.greet();
		d1.introduce();
		
		p1.greet();
		p1.introduce();
	}

}
