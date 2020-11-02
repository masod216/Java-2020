package Q7;

public class Truck {
	
	private String truckID;
	private String driverName;
	private int numStorage;
	private boolean isFree;
	
	public Truck(String truckID,String driverName,int numStorage)
	{
		this.truckID= truckID;
		this.driverName = driverName;
		this.numStorage = numStorage;
		isFree = true;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public int getNumStorage() {
		return numStorage;
	}

	public void setNumStorage(int numStorage) {
		this.numStorage = numStorage;
	}

	public boolean isFree() {
		return isFree;
	}

	public void setFree(boolean isFree) {
		this.isFree = isFree;
	}

	public String getTruckID() {
		return truckID;
	}
	
	
}
