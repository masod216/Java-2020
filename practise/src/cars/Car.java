א.	1
Public static boolean arr_ck(int[] arr){
If(arr.length%2==1 || arr. Length >= 3)
{ Return false; }
For (int I =0; I < arr.length ; i++)
{
	If(i%2==0)
	{
	If(arr[i]%2==0)
{ Return false; }
}
Else
{
	If(arr[i]%2==1)
		{ Return false; }
}
}
Return true;
}






א.2
Public static void arr_number_ck(int[] arr){
Int count =0;
For (int I =0; I < arr.length ; i++)
{
	If(arr[i]>100)
{
	Int dig1 = (Arr[i]%10);
	Int dig100 = (arr[i]/100)%10;
		If(dig1==dig100)
			count++;
	}
}
System.out.println(count);
}










ב.
Public static void duplicate(String letters, String digits){
Int count=0;
For (int I =0; I < digits.length() ; i++)
{
	count+=((int)Digits.charAt(i));
}
Char[] output = new Char[count];
Index_output = 0;
For (int I =0; I < digits.length() ; i++)
{
	For (int j =0; j < (int)Digits.charAt(i)) ; j++)
	{
		Output[Index_output] = letters.charAt(i);
		Index_output++;
}
}
For (int I =0; I < Output.length ; i++)
	System.out.print(Output[i]);
}





3.
Public class Car {

	String car_number;
	Int car_size;
	Boolean handicap_tag;
	String owner;
	
	Public Car(String car_number, Int car_size, Boolean handicap_tag, String owner)
{
	This.car_number = car_number;
	This.car_size = car_size;
	This.handicap_tag = handicap_tag;
	This.owner = owner ;
}
	Public String Get_car_number()
		{Return car_number;}

	Public int Get_car_size()
		{Return car_size;}

	Public Boolean Get_ handicap_tag()
		{Return handicap_tag;}

	Public String Get_owner()
		{Return owner;}

	Public Boolean Set_handicap_tag(Boolean handicap_tag)
		{	This.handicap_tag= handicap_tag;}
	Public String Set_ owner(String owner)
		{This.owner= owner;}
}

Public class garage {
	Arraylist <Car> in_ garage = new Arraylist<Car>();
Int max_car;

Public garage(Arraylist in_ garage, int max_car)
{
	This.in_ garage = in_ garage;
This.max_car = max_car;
}








	Public boolean add_car(Car car1)
	{
		If(in_ garage.size()<max_car)
		{
			 For(int i=0; I < in_ garage.size();i++)
			{
				If(car1 == in_ garage.get(i))
					Return false;
			}
			in_ garage.add(car1);
			return true;
		}
		Else{
System.out.println(“garage is full”);
}
}



	Public void exit_car(Car car1)
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


Public class slot{

Int parking_size;
Boolean taken;
String current_car; 
string saved_number;
int start_time;
int end_time;

Public slot(Int parking_size, Boolean taken)
{
This.parking_size= parking_size;
This.taken=taken;
}


Public slot(Int parking_size, Boolean taken, string saved_number)
{
This.saved_number = saved_number;
This.parking_size= parking_size;
This.taken=taken;
}

Public slot(Int parking_size, Boolean taken,int start_time,int end_time)
{
This.saved_number = saved_number;
This.parking_size= parking_size;
This.taken=taken;
This.start_time = start_time;
This.end_time = end_time;
}








Public boolean add(car car1,int time)
{
	If(parking_size <= car.get_size() && taken==false)
{
	If(parking_size ==2)
		If(saved_number == car1.Get_car_number()) {
			Taken = true;
current_car = car1.get_car_number();;
Return true;
		}
	If(parking_size ==3)
		If(car1.Get_ handicap_tag()==true) {
			Taken = true;
current_car = car1.get_car_number();;
Return true;
		}
	If(parking_size ==1)
		If(time>=start_time && time<= end_time){
			Taken = true;
current_car = car1.get_car_number();
Return true;
		}

}
Return false;
}

Public void remove(car car1)
{
If(car1.get_car_number() == current_car)
{
		Taken = flase;
current_car = “”;
}
}


Public class ParkingLot{
Slot[] lot;
Public ParkingLot(int numberOfSlots,Car[] carArr)
	
	For(int i=0; I < numberOfSlots*0.2; i++)
	{
		If(i< numberOfSlots*0.2)
			lot[i]  = New slot(3, false);
		else If(i< numberOfSlots*0.3)
lot[i]  = New slot(2, false,carArr[i].get_car_number);
		else
			lot[i]  = New slot(1, false, 3,7);
	}

Public int GetParkingSlot(car car1,time)
{
	For(int i=0; i< lot.length;i++)
	{
		If(lot[i].add(car1,time)
			Return I;
	}
	Return -1;
}
}















Public class UniversityGate
{

Public void carEnter(car car1,string destination,time)
{
	If(destination == “parkingLot”)
	{
	Int slot_number  = GetParkingSlot(car1,time);
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

