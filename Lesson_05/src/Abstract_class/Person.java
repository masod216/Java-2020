package Abstract_class;

public abstract class Person {

	private String nameString;
	private int id;
	
	public Person(String nameString, int id) {
		this.nameString = nameString;
		this.id = id;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getId() {
		return id;
	}
	
	public abstract void talk();
	
}
