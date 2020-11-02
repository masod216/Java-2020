package Toy;

import java.util.Scanner;

public class MainClass {
	
	public static void SerchByAge(int age, Toy[] array) {
		for (int i = 0; i < array.length; i++) {
			if(array[i].Getyear() == age)
				System.err.println(array[i]);
		}
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Toy[] toysArray = new Toy[3];
		
		//toysArray[0] = new Toy(1,"a","b",2);
		//toysArray[1] = new Toy(1,"c","d",3);
		//toysArray[2] = new Toy(1,"e","f",6);
		
		/*
		for (int i = 0; i < toysArray.length; i++) 
		{
			
			System.out.println("Enter code");
			int code = input.nextInt();
			System.out.println("Enter group");
			String group = input.nextLine();
			System.out.println("Enter manufact");
			String manufact = input.nextLine();
			System.out.println("Enter year");
			int year = input.nextInt();
			
			toysArray[i] = new Toy(code,group,manufact,year);
		}
		*/
		System.out.println("Enter age");
		int age = input.nextInt();
		SerchByAge(age,toysArray);
	}



}
