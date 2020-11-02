package Abstract_class;

public class woman extends Person{

	public woman(String nameString, int id) {
		super(nameString, id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		System.out.println("im a woman");
		
	}

}
