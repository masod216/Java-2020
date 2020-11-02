package AFG;

public class Item {

	private long Catalog;
	private String name;
	private Double Price;
	
	public Item(long Catalog,String name,Double Price)
	{
		this.Catalog = Catalog;
		this.name = name;
		this.Price = Price;
	}
	
	public double Cost(int N)
	{
		double cost=N*this.Price;
		return cost;
	}
	
 	public void SetData(long Catalog,String name,Double Price)
	{
		this.Catalog = Catalog;
		this.name = name;
		this.Price = Price;
	}
	
	public String toString() 
	{
		return Catalog+" : "+name+" : "+Price;
	}
	
	
 	public long GetCatalog()
	{
		return Catalog;
	}
	
	public String GetName()
	{
		return name;
	}
	
	public Double GetPrice()
	{
		return Price;
	}
	
	
}
