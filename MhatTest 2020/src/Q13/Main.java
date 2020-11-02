package Q13;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1= "A3BC12eDba";
		System.out.println(What(s1, 0));
		
	}
	public static String What(String s, int i)
	{
		if (s.length() == i)
			return "";
		
		if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			return s.charAt(i) + What(s, i + 1);
		
		if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			return What(s, i + 1) + s.charAt(i);
		
		return What(s, i + 1);
	}
}

//ABCD   abe
/*
A+(B +(C + ((D+((a)+b))+e)))

s.charAt(k) + What(s, k + 1); = $ + ()

What(s, k + 1) + s.charAt(k); = () + $

A + (B + (C + (() + e)))

*/