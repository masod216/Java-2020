
public class SunCar extends Electric implements AvgSun{
	public SunCar(String name, int km, double energy, Boolean sunroof) {
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
	public void AvgSun() {
		// TODO Auto-generated method stub
		System.out.println(super.getEnergy()*2100.8);
	}

	@Override
	public String toString() {
		return "SunCar [energy=" + energy + ", sunroof=" + sunroof + ", name=" + name + ", km=" + km + "]";
	}
	
}
