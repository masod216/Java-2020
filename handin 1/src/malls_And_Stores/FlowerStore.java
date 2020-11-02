package malls_And_Stores;

public class FlowerStore extends Store{
	
	private int AmontOfOrders;
	
	public FlowerStore(int rent,String StoreName, int AmontOfOrders)
	{
		super(rent, StoreName);
		this.AmontOfOrders = AmontOfOrders;
	}

	public int getAmontOfOrders() {
		return AmontOfOrders;
	}

	public void setAmontOfOrders(int amontOfOrders) {
		AmontOfOrders = amontOfOrders;
	}
	
	@Override
	public String toString()
	{
		return "Store name : "+this.get_StoreName()+" monthly rent : "+this.get_rent()+" number of orders this months : "+ AmontOfOrders;
	}
}
