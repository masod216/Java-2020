package AFG;

public class NewItem {
	
	int bonus;
	Item product;
	
	public NewItem(Item product,int bonus) 
	{
		this.bonus = bonus;
		this.product = product;
	}
	
	public void setBonus(int bonus)
	{
		this.bonus = bonus;
	}
	
	public double cost(int N) //1000
	{
		double cost=0;
		if (N>100) 
		{
			cost = 100*this.product.GetPrice();
			cost += (((N-100)*this.product.GetPrice())*(double)(100-this.bonus)/100);
		}
		else 
		{
			cost=N*this.product.GetPrice();
		}
		return cost;
	}
	
	public double NewCost(int N) 
	{
		double cost=0;
		double Price = (double)this.product.GetPrice();//14
		double bonus = (double)(100-this.bonus)/100;//0.9
		double new_bonus=bonus;
		int temp_N= N-100;//300
		
		if (N<=100) {
			cost=(double)(N*Price);
		}
		else if (N>100) 
		{
			cost = 100*Price;
			N-=100;//300
			
			for (int i = 0; i <= (temp_N/100); i++)
			{
				
				if (new_bonus<0.5)
					new_bonus = 0.5;
				
				if (N>100)
					cost += (100*Price)*new_bonus;
				else {
					System.out.println(N);
					cost += (N*Price)*new_bonus;
					return cost;
					
				}
				N-=100;
				new_bonus*=bonus;	
			}
		}
		return cost;
	}
	

}
