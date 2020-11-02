package arielProjectExamA;

public class Save extends Slot{

	public Save(int sizeNo) {
		super(sizeNo);
		
	}
	public Save()
	{
		
	}
	@Override
	public boolean addCar(Car c)
	{
		if(super.addCar(c) == true && c.getCarNo() == getC().getCarNo())
		{
			setC(c);
			return true;
		}
		return false; 
	}

	
}
