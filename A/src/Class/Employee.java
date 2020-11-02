package Class;

import Abstrac.Person;
import Interface.IEmployee;

public class Employee extends Person implements IEmployee{

	private String workplace;
	private String job;
	
	public Employee(String workplace, String job ,String name, String id)
	{
		super(name, id);
		this.workplace = workplace;
		this.job = job;
	}
	
	public String getWorkplace() {
		return workplace;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	public void setWorkplace(String workplace) {
		this.job = workplace;
	}
	
	@Override
	public String toString()
	{
		return " workplace =  "+workplace+" job = "+job;
	}
	
	public void introduce() {
		super.toString();
		System.out.println(this);
	}
	
	public String workInfo()
	{
		return " workplace =  "+workplace+" job = "+job;
	}
}
