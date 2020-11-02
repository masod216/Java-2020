package malls_And_Stores;
import java.util.ArrayList;

public class Mall {

	public ArrayList<Store> MallStores;
	
	public Mall() {
		MallStores = new ArrayList<Store>();
	}
	
	public void add_Flower_Store(int rent,String StoreName, int AmontOfOrders)
	{
		FlowerStore Flower_Store = new FlowerStore(rent, StoreName, AmontOfOrders);
		MallStores.add(Flower_Store);
	}
	
	public void add_Book_Store(int rent, String StoreName, int numberOfTypesOfBooks)
	{
		BookStore Book_Store = new BookStore(rent, StoreName, numberOfTypesOfBooks);
		MallStores.add(Book_Store);
	}
	
	public void printMallInfo() {
	
		int numberOfBookStores = 0;
		int rentSum = 0;
		
		for (Store Shop : MallStores) {
			
			rentSum+= Shop.get_rent();
					
			if(Shop instanceof BookStore)
				numberOfBookStores++;
		}
		System.out.println("rentSum : "+rentSum+", numberOfBookStores : "+numberOfBookStores);
	}
	
	
	
}
