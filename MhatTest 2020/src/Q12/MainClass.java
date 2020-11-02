package Q12;

import java.util.ArrayList;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		
		//loop ! STOP in family name
		Start();
	}
	
	public static void Start() {
		Scanner in = new Scanner(System.in);
		ArrayList<Family1> FamilyList = new ArrayList<>();
		
		System.out.println("Enter family name: ");
		String name = in.nextLine();
		
		while (!name.toUpperCase().equals("STOP")) { // 
			
			System.out.println("Enter number of family members: ");
			int num = in.nextInt();
			
			FamilyList.add(new Family1(name, num)); // adds the new family to the list at the end of the list
			
			 //(FamilyList.size()-1) give us the last obj in the list
			FamilyList.get(FamilyList.size()-1).Input(); // gets the last obj in list and calls for input of ages in the family
			System.out.println(FamilyList.get(FamilyList.size()-1).GetTotalSum()); // print the total cost of the trip for that family
			
			System.out.println("Enter family name: ");
			in.nextLine();
			name = in.nextLine();
			
		}
		
		System.out.println("end of app");

		
	}

}

/*


*/