package day1;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args) {
		ArrayList<APerson> arrlist = new ArrayList<>();
		
		while () {
			switch(Menu())
			
		}
	}
	
	public static int Menu() {
		Scanner in = new Scanner(System.in);
		System.out.println("Pick a number 1-3");
		System.out.println("[1] - Student");
		System.out.println("[2] - Employee");
		System.out.println("[3] - StudentEmployee");
		String userinput = in.nextLine();
		
		switch (userinput) {
		case "1": {
			return 1;
		}
		case "2": {
			return 2;
		}
		case "3": {
			return 3;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + userinput);
		}
		
		
	}

}
