package malls_And_Stores;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mall m1 = new Mall();
		
		m1.add_Book_Store(1300, "good things", 34023);
		m1.add_Flower_Store(4000, "Flowers and stuff", 300);
		Store s1 = new Store(400, "a");
		Store s2 = new Store(420, "b");
		
		//System.out.println(s1.equals(s2));
		m1.printMallInfo();
	}

}
