package arielProjectExamA;

public class UniversityGate {

	public void carEntry(Car c , String place)
	{
		Garage garage = new Garage(20);
		ParkingLot parkingLot = new ParkingLot(20);
		
		if( place.equals("Garage"))
		{
			System.out.println(garage.getNoOfCars() > 0 );
		}
		else
		{
			System.out.println(parkingLot.getParkingSlot(c));
		}
	}
	
}
