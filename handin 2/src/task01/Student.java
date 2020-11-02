package task01;

public class Student extends Person{

	private String dept;
	private int year;
	
	public Student(String dept, int year ,String name, String id)
	{
		super(name, id);
		this.dept = dept;
		this.year = year;
	}
	
	public String getDept() {
		return dept;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" dept =  "+dept+" year = "+year;
	}
	
	public void introduce() {
		System.out.println(this.toString());
	}
	
	public String studentInfo()
	{
		return super.toString()+" dept =  "+dept+" year = "+year;
	}
	
	
	
}
