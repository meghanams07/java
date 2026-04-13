class BookingSystemRunner{
	public static void main(String[] args){
		
		BookingSystem booking = new BookingSystem();

		Ticket t1 = new Ticket();
		t1.setTicketId(1); t1.setPassengerName("Passenger1"); t1.setSource("Chennai");
		booking.addTicket(t1);

		Ticket t2 = new Ticket();
		t2.setTicketId(2); t2.setPassengerName("Passenger2"); t2.setSource("Bangalore");
		booking.addTicket(t2);

		Ticket t3 = new Ticket();
		t3.setTicketId(3); t3.setPassengerName("Passenger3"); t3.setSource("Delhi");
		booking.addTicket(t3);

		Ticket t4 = new Ticket();
		t4.setTicketId(4); t4.setPassengerName("Passenger4"); t4.setSource("Mumbai");
		booking.addTicket(t4);

		Ticket t5 = new Ticket();
		t5.setTicketId(5); t5.setPassengerName("Passenger5"); t5.setSource("Hyderabad");
		booking.addTicket(t5);

		Ticket t6 = new Ticket();
		t6.setTicketId(6); t6.setPassengerName("Passenger6"); t6.setSource("Kolkata");
		booking.addTicket(t6);

		Ticket t7 = new Ticket();
		t7.setTicketId(7); t7.setPassengerName("Passenger7"); t7.setSource("Goa");
		booking.addTicket(t7);

		Ticket t8 = new Ticket();
		t8.setTicketId(8); t8.setPassengerName("Passenger8"); t8.setSource("Pune");
		booking.addTicket(t8);

		Ticket t9 = new Ticket();
		t9.setTicketId(9); t9.setPassengerName("Passenger9"); t9.setSource("Jaipur");
		booking.addTicket(t9);

		Ticket t10 = new Ticket();
		t10.setTicketId(10); t10.setPassengerName("Passenger10"); t10.setSource("Ahmedabad");
		booking.addTicket(t10);

		Ticket t11 = new Ticket();
		t11.setTicketId(11); t11.setPassengerName("Passenger11"); t11.setSource("Lucknow");
		booking.addTicket(t11);

		Ticket t12 = new Ticket();
		t12.setTicketId(12); t12.setPassengerName("Passenger12"); t12.setSource("Bhopal");
		booking.addTicket(t12);

		Ticket t13 = new Ticket();
		t13.setTicketId(13); t13.setPassengerName("Passenger13"); t13.setSource("Indore");
		booking.addTicket(t13);

		Ticket t14 = new Ticket();
		t14.setTicketId(14); t14.setPassengerName("Passenger14"); t14.setSource("Surat");
		booking.addTicket(t14);

		Ticket t15 = new Ticket();
		t15.setTicketId(15); t15.setPassengerName("Passenger15"); t15.setSource("Nagpur");
		booking.addTicket(t15);

		Ticket t16 = new Ticket();
		t16.setTicketId(16); t16.setPassengerName("Passenger16"); t16.setSource("Mysore");
		booking.addTicket(t16);

		Ticket t17 = new Ticket();
		t17.setTicketId(17); t17.setPassengerName("Passenger17"); t17.setSource("Coimbatore");
		booking.addTicket(t17);

		Ticket t18 = new Ticket();
		t18.setTicketId(18); t18.setPassengerName("Passenger18"); t18.setSource("Trichy");
		booking.addTicket(t18);

		Ticket t19 = new Ticket();
		t19.setTicketId(19); t19.setPassengerName("Passenger19"); t19.setSource("Madurai");
		booking.addTicket(t19);

		booking.getDetails();
	}
}