package day1;

public class StudentEmployee extends Student implements IPerson,IEmployee,IStudent{
	
	private String workplace;
	private String job;
	
	public StudentEmployee(String name,String ID,String dept,int year,String workplace,String job)
	{
		super(name,ID,dept,year);
		this.workplace =workplace;
		this.job =job;
	}
	
	public void introduce() {
		super.introduce();
		System.out.println("dept: "+workplace+" year: "+job);
	}
	
	//@Override
	//public String studentInfo() {
	//	return(super.studentInfo());
	//}

	@Override
	public String workInfo() {
		return("dept: "+workplace+" year: "+job);
	}
}
