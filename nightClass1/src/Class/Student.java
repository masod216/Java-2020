package Class;

import Abstrac.Person;
import Interface.IStudent;

public class Student extends Person implements IStudent{

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
		return " dept =  "+dept+" year = "+year;
	}
	
	public void introduce() {
		super.toString();
		System.out.println(this);
	}
	
	public String studentInfo()
	{
		return " dept =  "+dept+" year = "+year;
	}
	
	
	
}
