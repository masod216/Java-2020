package Q3;

public abstract class SlotA {

		private int parking_size;
		Boolean taken;
		Car current_car; 

		
		public SlotA(int parking_size) {
			this.parking_size = parking_size;
			taken = false;
		}
		
		public int getParking_size() {
			return parking_size;
		}

		public void setParking_size(int parking_size) {
			this.parking_size = parking_size;
		}

		public Boolean getTaken() {
			return taken;
		}

		public void setTaken(Boolean taken) {
			this.taken = taken;
		}

		public Car getCurrent_car() {
			return current_car;
		}


		public void setCurrent_car(Car current_car) {
			this.current_car = current_car;
		}

		public boolean add_car(Car car1,int time)
		{
			return (car1 != null && car1.Get_car_size() <= parking_size);
			
		}
		
	
	
}
