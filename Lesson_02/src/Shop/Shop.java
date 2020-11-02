package Shop;

public class Shop {
	
	private String Name;
	private Double banana;
	private Double apple;
	private Double orange;

	public Shop(String name,Double banana_p,Double apple_p,Double orange_p)
	{
		this.Name = name;
		this.banana = banana_p;
		this.apple = apple_p;
		this.orange = orange_p;
	}
	
	
	public void setDSata(String name,Double banana_p,Double apple_p,Double orange_p)
	{
		this.Name = name;
		this.banana = banana_p;
		this.apple = apple_p;
		this.orange = orange_p;
	}
	
	public void print()
	{
		System.out.println(Name);
		System.out.println("Banana price : "+banana);
		System.out.println("Apple price : "+apple);
		System.out.println("Orange price : "+orange);
	}

	public String getName()
	{
		return Name;
	}
	
	public Double getBanana()
	{
		return banana;
	}
	
	public Double getApple()
	{
		return apple;
	}
	
	public Double getOrange()
	{
		return orange;
	}
	
	public String toString() 
	{
		return Name + " " + apple + " " + orange + " " + banana;
	}
}
