package Q16;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number 1-27");
		int user_num = input.nextInt();
		boolean flag = false;

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter a number");
			numbers.add(input.nextInt());
		}
		
		for (int i = 0; i < numbers.size(); i++) {
			int temp_num = numbers.get(i);
			int sum = 0;
			
			while (temp_num>0) {
				sum += temp_num%10;
				temp_num/=10;
			}
			if (sum == user_num) {
				flag = true;
				System.out.println(numbers.get(i));
			}
		}
		
		if (flag == false) {
			System.out.println("Not found");
		}
		

	}

}
