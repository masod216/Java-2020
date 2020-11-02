package lesson_02;

public class ClassMain {

	public static void main(String[] args) {
		

		//Baby b1 = new Baby( 1111 );
		Baby b2 = new Baby( 2222 );
		Baby b3 = new Baby( 3333 , "Eli" );
		
		b3.setName("bob");
		System.out.println(b3.getName());
		
		b2.setName("alice");
		System.out.println(b3.getID());
	}

}
