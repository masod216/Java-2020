package lesson_01;

import java.util.Scanner;

//syso

public class number_of_chars_in_string {
	
	public static void func(int num1) 
	{
		int count=1;
		
		while (num1 != 0)
		{	
				System.out.print(count+",");
			num1/=10;
			count++;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter num1");
		num1 = input.nextInt();
		
			func(num1); //3453
		}
		
	}


