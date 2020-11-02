package day1;

public class Employee extends APerson implements IPerson,IEmployee{

	private String workplace;
	private String job;
	
	public Employee(String name,String ID,String workplace,String job)
	{
		super(name, ID);
		this.workplace =workplace;
		this.job =job;
	}
	
	public String getWorkplace() {
		return workplace;
	}

	public void setWorkplace(String workplace) {
		this.workplace = workplace;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void introduce() {
		super.introduce();
		System.out.println("workplace: "+workplace+" job: "+job);
	}

	@Override
	public String workInfo() {
		return("dept: "+workplace+" year: "+job);
	}
}
