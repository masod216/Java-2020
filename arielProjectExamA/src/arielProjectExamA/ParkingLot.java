package arielProjectExamA;

import java.util.ArrayList;

public class ParkingLot {

	private ArrayList<Slot> arrSlot;
	private int size; 
	
	public ParkingLot(int size)
	{
		this.size = size; 
		arrSlot = new ArrayList<Slot>();
		
		for (int i=0 ; i< size ; i++ )
		{
			if( i < size *0.2 )
			{
				arrSlot.add( new Dec (3));
			}
			if( i >= size*0.2 && i < size*0.3)
			{
				arrSlot.add( new Save());
			}
			if( i >= size*0.3)
			{
				arrSlot.add(new Regular(9, 17));
			}
		}
		
	}
	public int getParkingSlot(Car c)
	{
		for(int i=0 ; i< arrSlot.size() ;i++)
		{
			if(arrSlot.get(i) instanceof Dec && arrSlot.get(i).getC() == null && c.isDec()==true )
				{
					return i;
				}		
		}
		for(int i=0 ; i< arrSlot.size() ;i++)
		{
			if(!(arrSlot.get(i) instanceof Save) && arrSlot.get(i).getC() == null)
			{
				return i;
			}
		}
		for(int i=0 ; i< arrSlot.size() ;i++)
		{
			if(!(arrSlot.get(i) instanceof Save) &&(!(arrSlot.get(i) instanceof Dec))&& arrSlot.get(i).getC() == null)
			{
				return i;
			}
		}
		
		return -1; 
		
	}
	
}






