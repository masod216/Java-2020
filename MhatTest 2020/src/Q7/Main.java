package Q7;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	private static void Printnames(Truck[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].isFree() && arr[i].getNumStorage()>=7)
				System.out.println(arr[i].getDriverName());
		}	
	}
	
	private static String maxStorage(Truck[] arr)
	{
		int max = -1;
		int index = -1;
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i].isFree() && arr[i].getNumStorage()>max) {
				max = arr[i].getNumStorage();
				index = i;
			}
		}
		
		if (index == -1) {
			return "Unable to service";
		}
		else {
			return arr[index].getTruckID();
		}
		
		
	}

}
