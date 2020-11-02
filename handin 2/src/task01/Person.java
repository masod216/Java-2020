package task01;

public abstract class Person {

	private String name;
	private String id;
	
	public Person(String name, String id)
	{
		this.name = name;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString()
	{
		return "name = " + name + " id = " + id;
	}
	
	
	
}
