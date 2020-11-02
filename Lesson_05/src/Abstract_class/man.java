package Abstract_class;

public class man extends Person{

	public man(String nameString, int id) {
		super(nameString, id);
	}
		
	@Override
	public void talk() {
			System.out.println("im a man!");
			
		}
	
}


