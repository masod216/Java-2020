package AFG;

public class ClassMain {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Item item1 = new Item(123,"door",14.0);
		NewItem NewItem1 = new NewItem (item1,10);
		
		System.out.println(item1.Cost(400));
		System.out.println(NewItem1.cost(400));
		System.out.println(NewItem1.NewCost(750));
	}

}
