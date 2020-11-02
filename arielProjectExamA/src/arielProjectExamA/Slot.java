package arielProjectExamA;

public abstract class Slot {

	private int sizeNo;
	private Car c;
	
	public Slot(int sizeNo) {
		
		this.sizeNo = sizeNo;
	}
	
	public Slot()
	{
		
	}

	public int getSizeNo() {
		return sizeNo;
	}

	public void setSizeNo(int sizeNo) {
		this.sizeNo = sizeNo;
	}

	public Car getC() {
		return c;
	}

	public void setC(Car c) {
		this.c = c;
	}
	
	public boolean addCar(Car c)
	{
		return  ( this.c != null && c.getSize() <= sizeNo  );
		
	}
	public void removeCar(Car c)
	{
		if( c.getCarNo() == this.getC().getCarNo())
			this.c = null;
	}
	
}
