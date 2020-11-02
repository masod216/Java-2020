package Polimorfisom_03;

import java.util.ArrayList;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cout=0;
		Man m1 = new Man("Bob", 1, 18, 14.2);
		Woman w1 = new Woman("Alice", 2, 18, 5.6);
		
		System.out.println(m1.toString());
		System.out.println(w1.toString());
		
		ArrayList<Person> arr = new ArrayList<Person>();
		
		arr.add(new Man("Bob", 1, 18, 14.2));
		arr.add(new Man("bani", 234, 23, 14.2));
		arr.add(new Woman("dana", 1111, 22, 3.4));
		arr.add(new Woman("ashraf", 21111, 20, 1.0));
		
		for (int i = 0; i < arr.size(); i++) 
		{
			//if (arr.get(i) instanceof Woman)
				//cout++;
		}
		
		for (Person person : arr) 
		{
			if (person instanceof Woman)
				cout++;		
		}
		
		System.out.println(cout);
	}

}
