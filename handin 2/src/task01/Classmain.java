package task01;

public class Classmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("home", "programer", "bob", "2");
		Student s1 = new Student("computers",2020, "rob", "345");
		StudentEmployee se1 = new StudentEmployee("R&D", "Chip Maker", "B.C.C", 2016, "zev", "134525");
		e1.introduce();
		s1.introduce();
		se1.introduce();
		

		System.out.println(s1.studentInfo());
		System.out.println(e1.workInfo());
	}

}
