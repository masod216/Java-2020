package Q3;

import java.util.ArrayList;

public class ParkingLot
{

	public ArrayList<Slot> Slotlist = new ArrayList<Slot>();

	public ParkingLot(int numberOfSlots,Car[] carArr)
	{
		for(int i=0; i < numberOfSlots; i++)
		{
			if(i< numberOfSlots*0.2)
				Slotlist.add(new Slot(3, false));
			else if(i< numberOfSlots*0.3)
				Slotlist.add(new Slot(2,false,carArr[i].Get_car_number()));
			else
				Slotlist.add(new Slot(1, false, 3,7));
		}
	}

	public int GetParkingSlot(Car car1,int time)
	{
		for(int i=0; i< Slotlist.size() ;i++)
		{
			if(Slotlist.get(i).add(car1, time))
					return i;
		}
		return -1;
		

	}
}

