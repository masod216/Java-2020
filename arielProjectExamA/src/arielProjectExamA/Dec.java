package arielProjectExamA;

public class Dec extends Slot{

	public Dec(int sizeNo) {
		super(sizeNo);
		
	}
	@Override
	public boolean addCar(Car c)
	{
		if (super.addCar(c) && c.isDec() == true)
		{
			setC(c);
			return true;
		}
		return false;
		
	}
}
