package day1;

public class Student extends APerson implements IPerson,IStudent{
	
	private String dept;
	private int year;
	
	public Student(String name,String ID,String dept,int year)
	{
		super(name, ID);
		this.dept =dept;
		this.year =year;
	}
	
	public void introduce() {
		super.introduce();
		System.out.println("dept: "+dept+" year: "+year);
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String studentInfo() {
		return("dept: "+dept+" year: "+year);
	}
}
