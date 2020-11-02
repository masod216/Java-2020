package task2;

public class Lecturer {

	private String name;
	private String dept;
	private int YearsOfExperience;
	private String nextClass;
	
	public Lecturer(String name, String dept, int yearsOfExperience,String nextClass) {
		this.name = name;
		this.dept = dept;
		this.nextClass = nextClass;
		YearsOfExperience = yearsOfExperience;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getYearsOfExperience() {
		return YearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		YearsOfExperience = yearsOfExperience;
	}
	
	@Override
	public String toString()
	{
		return "name = "+name+", dept = "+dept+", YearsOfExperience = "+YearsOfExperience;
	}
	public void introduce() {
		System.out.println("Lecturer"+toString());
	}
	
	public void greet() {
		System.out.println("dr."+name+"'s invits you to join his class in : "+nextClass);
	}
}
