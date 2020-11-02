package arielProjectExamA;

public class Car {

	private int carNo;
	private int size; 
	private boolean isDec;
	private String name;
	
	public Car(int carNo, int size, boolean isDec, String name) {
		
		this.carNo = carNo;
		this.size = size;
		this.isDec = isDec;
		this.name = name;
	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isDec() {
		return isDec;
	}

	public void setDec(boolean isDec) {
		this.isDec = isDec;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", size=" + size + ", isDec=" + isDec + ", name=" + name + "]";
	}
	
	
	
}
