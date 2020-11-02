
public class UltimateCar extends Electric implements AvgElect, AvgSun, AvgGas{
	int year;
	public UltimateCar(String name, int km, double energy, Boolean sunroof, int year) {
		super(name, km, energy, sunroof);
		this.year = year;
	}

	void carInfo()
	{
		System.out.println("type: "+getClass());
		System.out.println("km: "+super.getKm());
		System.out.println("energy: "+super.getEnergy());
		System.out.println("sunroof: "+super.getSunroof());
	}

	@Override
	public void AvgGas() {
		// TODO Auto-generated method stub
		System.out.println(super.getKm()/(2019-year));
	}

	@Override
	public void AvgSun() {
		// TODO Auto-generated method stub
		System.out.println(super.getEnergy()*2100.8);
	}

	@Override
	public void AvgElect() {
		// TODO Auto-generated method stub
		System.out.println(super.getKm()*super.getEnergy());
	}

	@Override
	public String toString() {
		return "UltimateCar [year=" + year + ", energy=" + energy + ", sunroof=" + sunroof + ", name=" + name + ", km="+ km + "]";
	}
	
}
