package arielProjectExamA;

import java.util.ArrayList;

public class Garage {

	private int noOfCars;
	private ArrayList<Car> arrCar;
	
	public Garage(int noOfCars) {
		
		this.noOfCars = noOfCars;
		arrCar = new ArrayList<Car>();
	}

	public int getNoOfCars() {
		return noOfCars;
	}

	public void setNoOfCars(int noOfCars) {
		this.noOfCars = noOfCars;
	}
	
	public int isCarInGarage(Car c)
	{
		int i=0;
		
		for( Car car : arrCar)
		{
			if(c.getCarNo() == car.getCarNo())
				return i;
			i++;
		}
		return -1; 
	}
	
	public boolean addCar ( Car c )
	{
		if( arrCar.size() != noOfCars)
		{
			arrCar.add(c);
			return true;
		}
		return false; 
	}
	
	public void removeCar(Car c )
	{
		if( isCarInGarage(c) != -1)
			arrCar.remove( isCarInGarage(c));
	}
	
}






