package lesson_01;

import java.util.Scanner;

public class Task16_a {
	
	public static int func(String U_String , char U_char,int index) // asdafe, a
	{
		if (index == U_String.length())
			return  0; 

		if(U_String.charAt(index) == U_char)		
			return (1+func(U_String, U_char,index+1)); 
		else
			return (0+func(U_String, U_char,index+1)); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num1="asdasfw";
		char num2='a';
		int index=0;
	
		System.out.println(func(num1, num2,index));
	}

}
