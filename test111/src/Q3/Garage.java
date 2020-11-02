package Q3;

import java.util.ArrayList;

public class Garage
{
	private ArrayList<Car> in_garage;
	private int max_car;

	public Garage(ArrayList<Car> in_garage, int max_car)
	{
		this.in_garage = in_garage;
		this.max_car = max_car;
	}
	

	public boolean add_car(Car car1)
	{
			if(in_garage.size()<max_car)
			{
				for(int i=0; i < in_garage.size();i++)
				{
					if(car1.equals(in_garage.get(i)))
						return false;
				}
				in_garage.add(car1);
				return true;
			}
			else{
				System.out.println("garage is full");
				
				}
			return false;
	}


		public void exit_car(Car car1)
		{
			for(int i=0; i < in_garage.size();i++)
			{
				if(car1.equals(in_garage.get(i)))
				{
					in_garage.remove(i);
					System.out.println("car has exited");
				}
			}
			System.out.println("car was not found");
		}

	}




