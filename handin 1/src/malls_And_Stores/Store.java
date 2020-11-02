package malls_And_Stores;

public class Store {

	private int rent;
	private String StoreName;
	
	public Store(int rent,String StoreName)
	{
		this.rent = rent;
		this.StoreName = StoreName;
	}
	
	public void set_rent(int rent)
	{
		this.rent = rent;
	}
	
	public int get_rent()
	{
		return this.rent;
	}
	
	public String get_StoreName()
	{
		return this.StoreName;
	}
	
	public boolean equals(Store Shop)
	{
		if (this.rent == Shop.get_rent()) {
			return true;
		}
		return false;
	}
}
