package arielProjectExamA;

public class A {

}

public static void duplicate(String letters, String digits){
int count=0
Arraylist <Char> output = new Arraylist<Char>();
For (int I =0; I < digits.length() ; i++)
{
	For (int j =0; j < (int)Digits.charAt(i)) ; j++)
	{
		Output.add(letters.charAt(count))
}
count++;
}
For (int I =0; I < Output.size() ; i++)
	System.out.print(Output.get(i));
}



public class Car{

	String car_number;
	int car_size;
	Boolean handicap_tag;
	String owner;
	
public Car(String car_number, Int car_size, Boolean handicap_tag, String owner)
{
	this.car_number = car_number;
	this.handicap_tag = handicap_tag;
	this.owner = owner ;
}
public String Get_car_number()
		{return car_number;}

public int Get_car_size()
		{return car_size;}

public Boolean Get_ handicap_tag()
		{return handicap_tag;}

public String Get_owner()
		{return owner;}

public Boolean Set_handicap_tag(Boolean handicap_tag)
		{	this.handicap_tag= handicap_tag;}
public String Set_ owner(String owner)
		{this.owner= owner;}
}

public class garage implements func
{
	Arraylist <Car> in_ garage = new Arraylist<Car>();
int max_car;

public garage(Arraylist in_ garage, int max_car)
{
	this.in_ garage = in_ garage;
	this.max_car = max_car;
}







@override
public boolean add_car(Car car1)
	{
		If(in_ garage.size()<max_car)
		{
			 For(int i=0; I < in_ garage.size();i++)
			{
				If(car1 == in_ garage.get(i))
					return false;
			}
			in_ garage.add(car1);
			return true;
		}
		Else{
System.out.println(“garage is full”);
}
}







public void exit_car(Car car1)
	{
		 For(int i=0; I < in_ garage.size();i++)
		{
			If(car1 == in_ garage.get(i))
{
				in_ garage.remove(i);
System.out.println(“car has exited”);
			}
		}
		System.out.println(“car was not found”);
}

}












public class slot implements func
{

int parking_size;
Boolean taken;
String current_car; 
string saved_number;
int start_time;
int end_time;

public slot(int parking_size, Boolean taken)
{
	this.parking_size= parking_size;
	this.taken=taken;
}


public slot(int parking_size, Boolean taken, string saved_number)
{
	this.saved_number = saved_number;
	this.parking_size= parking_size;
	this.taken=taken;
}

public slot(int parking_size, Boolean taken,int start_time,int end_time)
{
	this.saved_number = saved_number;
	this.parking_size= parking_size;
	this.taken=taken;
	this.start_time = start_time;
	this.end_time = end_time;
}

@override
public boolean add(car car1,int time)
{
	If(parking_size <= car.get_size() && taken==false)
{
	If(parking_size == 2)
		If(saved_number == car1.Get_car_number()) {
			Taken = true;
current_car = car1.get_car_number();;
return true;
		}
	If(parking_size == 3)
		If(car1.Get_ handicap_tag()==true) {
			Taken = true;
current_car = car1.get_car_number();;
return true;
		}
	If(parking_size == 1)
		If(time>=start_time && time<= end_time){
			Taken = true;
current_car = car1.get_car_number();
return true;
		}

}
return false;
}

public void remove(car car1)
{
If(car1.get_car_number() == current_car)
{
		Taken = flase;
current_car = “”;
}
}





public class ParkingLot implements func
{
Slot[] lot;
public ParkingLot(int numberOfSlots,Car[] carArr)
	For(int i=0; I < numberOfSlots*0.2; i++)
	{
		If(i< numberOfSlots*0.2)
			lot[i]  = New slot(3, false);
		else If(i< numberOfSlots*0.3)
lot[i]  = New slot(2, false,carArr[i].get_car_number);
		else
			lot[i]  = New slot(1, false, 3,7);
	}
@override
public int GetParkingSlot(car car1,time)
{
	For(int i=0; i< lot.length;i++)
	{
		If(lot[i].add(car1,time)
			return I;
	}
	return -1;
}
}
סעיף ג

public class UniversityGate implements func
{

public void carEnter(car car1,string destination,time)
{
	If(destination == “parkingLot”)
	{
	int slot_number  = GetParkingSlot(car1,time);
	If(slot_number  != -1)
		System.out.println(“you are parked at slot: ”+ slot_number );
	}
else
{
If( add_car(car1))
	System.out.println(“we have a spot for you”);
	}

}	
} 



public interface func{
	public GetParkingSlot();
	public add_car ();


}
