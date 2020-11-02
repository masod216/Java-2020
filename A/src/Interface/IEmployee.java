package Interface;

public interface IEmployee extends IPerson{
	public String getWorkplace();
	
	public String getJob();
	
	public void setJob(String job);
	public void setWorkplace(String workplace);
	
	public String toString();
	public String workInfo();
}
