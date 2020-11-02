import java.util.ArrayList;

public class ClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList SunElec = new ArrayList();
		ArrayList All = new ArrayList();
		ArrayList Elec = new ArrayList();
		ArrayList Sun = new ArrayList();
		ArrayList Ulti = new ArrayList();
		GasolineCar mazda = new GasolineCar("mazda 6", 250, 2008);
		ElectricCar Tesla = new ElectricCar("tesla 3", 40, 100, true);
		SunCar prius = new SunCar("prius", 100, 20, false);
		UltimateCar bugati = new UltimateCar("veron",10,50,true,2020);
		SunElec.add(Tesla);
		SunElec.add(Ulti);
		All.add(mazda);
		All.add(Tesla);
		All.add(prius);
		All.add(bugati);
		Elec.add(Tesla);
		Sun.add(prius);
		Ulti.add(bugati);
		System.out.println("SunElec");
		for (int i = 0; i < SunElec.size(); i++) {
			System.out.println(SunElec.get(i));
			}
		System.out.println("All");
		for (int i = 0; i < All.size(); i++) {
			System.out.println(All.get(i));
			}
		System.out.println("Elec");
		for (int i = 0; i < Elec.size(); i++) {
			System.out.println(Elec.get(i));
			}
		System.out.println("Sun");
		for (int i = 0; i < Sun.size(); i++) {
			System.out.println(Sun.get(i));
			}
		System.out.println("Ulti");
		for (int i = 0; i < Ulti.size(); i++) {
			System.out.println(Ulti.get(i));
			}
		
		}

}
