package lesson_02;

public class Baby {

	int id;
	String name;
	
	public Baby(int main_id)
	{
		id = main_id;
	}

	public Baby(int main_id,String main_name) 
	{
		id=main_id;
		name=main_name;
	}
	
	public void setName(String new_name)
	{
		name = new_name;
	}
	
	public String getName() {
		return name;
	}
	public int getID()
	{
		return id;
	}
}
