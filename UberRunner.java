class UberRunner{
	public static void main(String[] args){
		
		Uber uber = new Uber();

		Passenger p1 = new Passenger();
		p1.setPassengerId(1); p1.setPassengerName("Passenger1"); p1.setLocation("Bangalore");
		uber.addPassenger(p1);

		Passenger p2 = new Passenger();
		p2.setPassengerId(2); p2.setPassengerName("Passenger2"); p2.setLocation("Chennai");
		uber.addPassenger(p2);

		Passenger p3 = new Passenger();
		p3.setPassengerId(3); p3.setPassengerName("Passenger3"); p3.setLocation("Delhi");
		uber.addPassenger(p3);

		Passenger p4 = new Passenger();
		p4.setPassengerId(4); p4.setPassengerName("Passenger4"); p4.setLocation("Mumbai");
		uber.addPassenger(p4);

		Passenger p5 = new Passenger();
		p5.setPassengerId(5); p5.setPassengerName("Passenger5"); p5.setLocation("Hyderabad");
		uber.addPassenger(p5);

		Passenger p6 = new Passenger();
		p6.setPassengerId(6); p6.setPassengerName("Passenger6"); p6.setLocation("Pune");
		uber.addPassenger(p6);

		Passenger p7 = new Passenger();
		p7.setPassengerId(7); p7.setPassengerName("Passenger7"); p7.setLocation("Kolkata");
		uber.addPassenger(p7);

		Passenger p8 = new Passenger();
		p8.setPassengerId(8); p8.setPassengerName("Passenger8"); p8.setLocation("Jaipur");
		uber.addPassenger(p8);

		Passenger p9 = new Passenger();
		p9.setPassengerId(9); p9.setPassengerName("Passenger9"); p9.setLocation("Goa");
		uber.addPassenger(p9);

		Passenger p10 = new Passenger();
		p10.setPassengerId(10); p10.setPassengerName("Passenger10"); p10.setLocation("Mysore");
		uber.addPassenger(p10);

		Passenger p11 = new Passenger();
		p11.setPassengerId(11); p11.setPassengerName("Passenger11"); p11.setLocation("Coimbatore");
		uber.addPassenger(p11);

		Passenger p12 = new Passenger();
		p12.setPassengerId(12); p12.setPassengerName("Passenger12"); p12.setLocation("Trichy");
		uber.addPassenger(p12);

		Passenger p13 = new Passenger();
		p13.setPassengerId(13); p13.setPassengerName("Passenger13"); p13.setLocation("Madurai");
		uber.addPassenger(p13);

		Passenger p14 = new Passenger();
		p14.setPassengerId(14); p14.setPassengerName("Passenger14"); p14.setLocation("Surat");
		uber.addPassenger(p14);

		Passenger p15 = new Passenger();
		p15.setPassengerId(15); p15.setPassengerName("Passenger15"); p15.setLocation("Nagpur");
		uber.addPassenger(p15);

		Passenger p16 = new Passenger();
		p16.setPassengerId(16); p16.setPassengerName("Passenger16"); p16.setLocation("Bhopal");
		uber.addPassenger(p16);

		Passenger p17 = new Passenger();
		p17.setPassengerId(17); p17.setPassengerName("Passenger17"); p17.setLocation("Lucknow");
		uber.addPassenger(p17);

		Passenger p18 = new Passenger();
		p18.setPassengerId(18); p18.setPassengerName("Passenger18"); p18.setLocation("Indore");
		uber.addPassenger(p18);

		Passenger p19 = new Passenger();
		p19.setPassengerId(19); p19.setPassengerName("Passenger19"); p19.setLocation("Patna");
		uber.addPassenger(p19);

		uber.getDetails();
	}
}