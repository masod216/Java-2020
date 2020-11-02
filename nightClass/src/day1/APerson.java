package day1;

public abstract class APerson implements IPerson {
	private String name;
	private String ID;
	
	public APerson(String name,String ID) {
		this.ID= ID;
		this.name=name;
	}
	
	public void introduce() {
		System.out.println("name: "+name+" ID: "+ID);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

}
