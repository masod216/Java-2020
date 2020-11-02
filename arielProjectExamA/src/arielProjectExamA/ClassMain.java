package arielProjectExamA;

public class ClassMain {

	public static boolean func1(int[] arr)
	{
		if(arr.length %2 != 0 || arr.length < 3 )
		{
			return false; 
		}
		for(int i=0 ; i< arr.length ; i++)
			{
				if(i %2 == 0 && arr[i] %2 == 0 || i %2 != 0 && arr[i] %2 != 0)
				{
				return false; 	
				}
			}
		return true;
	}
	
	public static void func2 ( int[] arr)
	{
		int count=0; 
		
		for(int i=0 ; i< arr.length ; i++)
		{
			if( arr[i] %10 == (arr[i] %1000) /100) 
				count++;
		}
		
		System.out.println(count);
	}
	public static void func3 (String letter ,String digit) // option 1
	{
		if(letter.length() == digit.length())
		{
			String str="";
			for( int i=0 ; i< letter.length() ; i++)
			{
				/*
				 * for(int j='0' ; j<digit.charAt(i); j++)
				 * 
				 * 
				 */		
				for(int j=0 ; j<Integer.parseInt(digit.charAt(i)+"" ); j++)
				{
				//	System.out.print(letter.charAt(i));
					str+= letter.charAt(i);
				}
			}
			System.out.println(str);
		}
		
	}
	public static void func3 (String letter ,int[] digit) // option 2
	{
		if( letter.length() == digit.length)
		{
			String str="";
			for( int i=0 ; i< letter.length() ; i++)
			{
				for(int j=0 ; j<digit[i] ; j++)
				{
					str+= letter.charAt(i);
				}
			}
			System.out.println(str);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		func3( "ctest" , "21423");
		
	}

}




