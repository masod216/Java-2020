package Check;


public class ClassMain {

	public static void main(String[] args) {

		Check[] CheckArray = new Check[4];
		
		Check CheckPrt = CheckArray[0];
		
		CheckArray[0] = new Check("514515","name_1",282,12300.3);
		CheckArray[1] = new Check("514514","name_2",542,1030.26);
		CheckArray[2] = new Check("514513","name_3",252,1060.3);
		CheckArray[3] = new Check("514512","name_4",533,104530.97);
		
		Search(CheckArray, CheckPrt);
	}
	
	private static void Search(Check[] CheckArray,Check CheckPrt) 
	{
		boolean flag = false;
		for (int i = 0; i < CheckArray.length; i++) 
			if (CheckPrt.Get_Ch_Number().equals(CheckArray[i].Get_Ch_Number()))
			{
				CheckArray[i].Print();
				flag = true;
			}
		if (flag==false)
			System.out.println("Check dose not exist");
	
	}

}
