class CourierRunner{
	public static void main(String[] args){
		
		Courier courier = new Courier();

		Parcel p1 = new Parcel();
		p1.setParcelId(1); p1.setSenderName("Sender1"); p1.setDestination("City1");
		courier.addParcel(p1);

		Parcel p2 = new Parcel();
		p2.setParcelId(2); p2.setSenderName("Sender2"); p2.setDestination("City2");
		courier.addParcel(p2);

		Parcel p3 = new Parcel();
		p3.setParcelId(3); p3.setSenderName("Sender3"); p3.setDestination("City3");
		courier.addParcel(p3);

		Parcel p4 = new Parcel();
		p4.setParcelId(4); p4.setSenderName("Sender4"); p4.setDestination("City4");
		courier.addParcel(p4);

		Parcel p5 = new Parcel();
		p5.setParcelId(5); p5.setSenderName("Sender5"); p5.setDestination("City5");
		courier.addParcel(p5);

		Parcel p6 = new Parcel();
		p6.setParcelId(6); p6.setSenderName("Sender6"); p6.setDestination("City6");
		courier.addParcel(p6);

		Parcel p7 = new Parcel();
		p7.setParcelId(7); p7.setSenderName("Sender7"); p7.setDestination("City7");
		courier.addParcel(p7);

		Parcel p8 = new Parcel();
		p8.setParcelId(8); p8.setSenderName("Sender8"); p8.setDestination("City8");
		courier.addParcel(p8);

		Parcel p9 = new Parcel();
		p9.setParcelId(9); p9.setSenderName("Sender9"); p9.setDestination("City9");
		courier.addParcel(p9);

		Parcel p10 = new Parcel();
		p10.setParcelId(10); p10.setSenderName("Sender10"); p10.setDestination("City10");
		courier.addParcel(p10);

		Parcel p11 = new Parcel();
		p11.setParcelId(11); p11.setSenderName("Sender11"); p11.setDestination("City11");
		courier.addParcel(p11);

		Parcel p12 = new Parcel();
		p12.setParcelId(12); p12.setSenderName("Sender12"); p12.setDestination("City12");
		courier.addParcel(p12);

		Parcel p13 = new Parcel();
		p13.setParcelId(13); p13.setSenderName("Sender13"); p13.setDestination("City13");
		courier.addParcel(p13);

		Parcel p14 = new Parcel();
		p14.setParcelId(14); p14.setSenderName("Sender14"); p14.setDestination("City14");
		courier.addParcel(p14);

		Parcel p15 = new Parcel();
		p15.setParcelId(15); p15.setSenderName("Sender15"); p15.setDestination("City15");
		courier.addParcel(p15);

		Parcel p16 = new Parcel();
		p16.setParcelId(16); p16.setSenderName("Sender16"); p16.setDestination("City16");
		courier.addParcel(p16);

		Parcel p17 = new Parcel();
		p17.setParcelId(17); p17.setSenderName("Sender17"); p17.setDestination("City17");
		courier.addParcel(p17);

		Parcel p18 = new Parcel();
		p18.setParcelId(18); p18.setSenderName("Sender18"); p18.setDestination("City18");
		courier.addParcel(p18);

		Parcel p19 = new Parcel();
		p19.setParcelId(19); p19.setSenderName("Sender19"); p19.setDestination("City19");
		courier.addParcel(p19);

		courier.getDetails();
	}
}