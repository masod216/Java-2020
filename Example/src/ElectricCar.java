
public class ElectricCar extends Electric implements AvgElect{
	public ElectricCar(String name, int km, double energy, Boolean sunroof) {
		super(name, km, energy, sunroof);
		// TODO Auto-generated constructor stub
	}

	void carInfo()
	{
		System.out.println("type: "+getClass());
		System.out.println("km: "+super.getKm());
		System.out.println("energy: "+super.getEnergy());
		System.out.println("sunroof: "+super.getSunroof());
	}

	@Override
	public void AvgElect() {
		// TODO Auto-generated method stub
		System.out.println(super.getKm()*super.getEnergy());
	}

	@Override
	public String toString() {
		return "ElectricCar [energy=" + energy + ", sunroof=" + sunroof + ", name=" + name + ", km=" + km + "]";
	}
	
}
