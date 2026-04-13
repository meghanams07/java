class AirportRunner{
	public static void main(String[] args){
		
		Airport airport = new Airport();

		Flight f1 = new Flight();
		f1.setFlightId(1); f1.setFlightName("Flight1"); f1.setDestination("Delhi");
		airport.addFlight(f1);

		Flight f2 = new Flight();
		f2.setFlightId(2); f2.setFlightName("Flight2"); f2.setDestination("Mumbai");
		airport.addFlight(f2);

		Flight f3 = new Flight();
		f3.setFlightId(3); f3.setFlightName("Flight3"); f3.setDestination("Chennai");
		airport.addFlight(f3);

		Flight f4 = new Flight();
		f4.setFlightId(4); f4.setFlightName("Flight4"); f4.setDestination("Bangalore");
		airport.addFlight(f4);

		Flight f5 = new Flight();
		f5.setFlightId(5); f5.setFlightName("Flight5"); f5.setDestination("Hyderabad");
		airport.addFlight(f5);

		Flight f6 = new Flight();
		f6.setFlightId(6); f6.setFlightName("Flight6"); f6.setDestination("Kolkata");
		airport.addFlight(f6);

		Flight f7 = new Flight();
		f7.setFlightId(7); f7.setFlightName("Flight7"); f7.setDestination("Goa");
		airport.addFlight(f7);

		Flight f8 = new Flight();
		f8.setFlightId(8); f8.setFlightName("Flight8"); f8.setDestination("Pune");
		airport.addFlight(f8);

		Flight f9 = new Flight();
		f9.setFlightId(9); f9.setFlightName("Flight9"); f9.setDestination("Jaipur");
		airport.addFlight(f9);

		Flight f10 = new Flight();
		f10.setFlightId(10); f10.setFlightName("Flight10"); f10.setDestination("Ahmedabad");
		airport.addFlight(f10);

		Flight f11 = new Flight();
		f11.setFlightId(11); f11.setFlightName("Flight11"); f11.setDestination("Lucknow");
		airport.addFlight(f11);

		Flight f12 = new Flight();
		f12.setFlightId(12); f12.setFlightName("Flight12"); f12.setDestination("Bhopal");
		airport.addFlight(f12);

		Flight f13 = new Flight();
		f13.setFlightId(13); f13.setFlightName("Flight13"); f13.setDestination("Indore");
		airport.addFlight(f13);

		Flight f14 = new Flight();
		f14.setFlightId(14); f14.setFlightName("Flight14"); f14.setDestination("Surat");
		airport.addFlight(f14);

		Flight f15 = new Flight();
		f15.setFlightId(15); f15.setFlightName("Flight15"); f15.setDestination("Nagpur");
		airport.addFlight(f15);

		Flight f16 = new Flight();
		f16.setFlightId(16); f16.setFlightName("Flight16"); f16.setDestination("Mysore");
		airport.addFlight(f16);

		Flight f17 = new Flight();
		f17.setFlightId(17); f17.setFlightName("Flight17"); f17.setDestination("Coimbatore");
		airport.addFlight(f17);

		Flight f18 = new Flight();
		f18.setFlightId(18); f18.setFlightName("Flight18"); f18.setDestination("Trichy");
		airport.addFlight(f18);

		Flight f19 = new Flight();
		f19.setFlightId(19); f19.setFlightName("Flight19"); f19.setDestination("Madurai");
		airport.addFlight(f19);

		airport.getDetails();
	}
}