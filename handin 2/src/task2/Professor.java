package task2;

public class Professor extends SeniorLecturer{
	
	private int numberOfPublications;

	public Professor(String name, String dept, int yearsOfExperience, String nextClass, int numberOfProjects,
			int numberOfPublications) {
		super(name, dept, yearsOfExperience, nextClass, numberOfProjects);
		this.numberOfPublications = numberOfPublications;
	}

	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+", numberOfPublications = "+numberOfPublications;
	}
	public void introduce() {
		System.out.println("prof."+toString());
	}
	
	public void greet() {
		System.out.println("prof."+super.getName()+" is inviting you to join his research ");
	}
}
