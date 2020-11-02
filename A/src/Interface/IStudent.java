package Interface;


public interface IStudent extends IPerson{

	public String getDept();
	
	public int getYear();
	
	public void setDept(String dept);
	public void setYear(int year);

	public String toString();
	
	public String studentInfo();
}
