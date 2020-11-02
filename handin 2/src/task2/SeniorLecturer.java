package task2;

public class SeniorLecturer extends Lecturer{
	
	private int numberOfProjects;
	private String Project;
	

	public SeniorLecturer(String name, String dept, int yearsOfExperience, String nextClass, int numberOfProjects) {
		super(name, dept, yearsOfExperience, nextClass);
		this.numberOfProjects = numberOfProjects;
	}

	public int getNumberOfProjects() {
		return numberOfProjects;
	}

	public void setNumberOfProjects(int numberOfProjects) {
		this.numberOfProjects = numberOfProjects;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+", numberOfProjects = "+numberOfProjects;
	}
	public void introduce() {
		System.out.println("Senior Lecturer"+toString());
	}
	
	public void greet() {
		System.out.println("dr."+super.getName()+"'s invits you to work with him on a Project : "+Project);
	}

}
