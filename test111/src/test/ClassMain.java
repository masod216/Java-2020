package test;

import java.util.ArrayList;

public class ClassMain {
	
		
		public static boolean arr_ck(int[] arr)
		{
			if(arr.length %2 == 1 || arr. length < 3)
				return false;
			
			for(int i =0; i < arr.length ; i++)
			{
				if(i%2==0 && arr[i]%2==0)
					{return false; }
				else
				{
					if(arr[i]%2==1)
						{ return false; }
				}
			}
			return true;
		}

		public static void arr_number_ck(int[] arr)
		{
			int count = 0;
			for (int i =0; i < arr.length ; i++)
			{
				if(arr[i]>100)
			{
				int dig1 = (arr[i]%10);
				int dig100 = (arr[i]/100)%10;
					if(dig1==dig100)
						count++;
				}
			}
			System.out.println(count);
		}
		public static void duplicate(String letters, String digits){
			ArrayList <Character> output = new ArrayList<Character>();
			
			for (int i =0; i < digits.length() ; i++)//4
			{
				for (int j =0 ; j < Integer.parseInt(digits.charAt(i)+""); j++) //4,6,3
				{
					output.add(letters.charAt(i));
				}
			}
			
			for (int i =0; i < output.size() ; i++)
				System.out.print(output.get(i));
			}



	public static void main(String[] args) {
		
		//arr_number_ck(new int {3,4,});
		//duplicate("abc","463");
		
		int[] arr = { 64, 34, 90, 12, 22, 11, 25 };
		int n = arr.length;
		func(arr, n);
		System.out.println ("The new array : " );
		printArray(arr, n);
	}
	
	static void func(int[] arr, int n) {
		if (n == 1)
			return;
		
		for (int i = 0; i < n - 1; i++)
		{
			if (arr[i] > arr[i + 1]) {
				arr[i] = arr[i] + arr[i + 1];
				arr[i + 1] = arr[i] - arr[i + 1];
				arr[i] = arr[i] - arr[i + 1];
			}
		}
		func(arr, n - 1);
	}
	
	static void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++)
			System.out.print( arr[i] + " ");
		System.out.println();
	}
	



}


