package task01;

public class Employee extends Person {

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
		return super.toString()+" workplace =  "+workplace+" job = "+job;
	}
	
	public void introduce() {
		System.out.println(this.toString());
	}
	
	public String workInfo()
	{
		return super.toString()+" workplace =  "+workplace+" job = "+job;
	}
}
