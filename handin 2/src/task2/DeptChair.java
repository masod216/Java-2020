package task2;

public class DeptChair extends Professor{
	
	private int yearOfpromotionToDeptChair;

	public DeptChair(String name, String dept, int yearsOfExperience, String nextClass, int numberOfProjects,
			int numberOfPublications, int yearOfpromotionToDeptChair) {
		super(name, dept, yearsOfExperience, nextClass, numberOfProjects, numberOfPublications);
		this.yearOfpromotionToDeptChair = yearOfpromotionToDeptChair;
	}

	public int getYearOfpromotionToDeptChair() {
		return yearOfpromotionToDeptChair;
	}

	public void setYearOfpromotionToDeptChair(int yearOfpromotionToDeptChair) {
		this.yearOfpromotionToDeptChair = yearOfpromotionToDeptChair;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+", yearOfpromotionToDeptChair = "+yearOfpromotionToDeptChair;
	}
	public void introduce() {
		System.out.println("prof."+toString());
	}
	
	public void greet() {
		System.out.println("prof."+super.getName()+" is inviting you to start a 2 dedree in the deparmit ");
	}
	
}
