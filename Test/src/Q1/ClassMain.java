package Q1;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public static void Q1(String str1,String str2)
	{

	    if(str1.length() > str2.length())
	    {
	        print(str1);
	    }
	    else if (str2.length() > str1.length())
	    {
	        print(str2);
	    }
	    else
	    {
	        System.out.println("same length");
	    }
	}
	public static void print(String word)
	{
	    String printing = "";
	    for(int i = 0 ; i < word.length(); i++)
	    {
	        printing = printing + word.charAt(i);
	        System.out.println(printing);
	    }
	}
	
	public static boolean value(int[] arr)
	{
	    int[] numbers = new int[10];
	    numbers[0] = 0;
	    for(int i = 0 ; i< arr.length; i++)
	    {
	        numbers[arr[i]] = arr[i];
	    }

	    for(int i = 0 ; i < numbers.length; i++)
	    {
	        if(numbers[i] != i)
	        {
	            return false;
	        }
	    }

	    return true;
	}
}
