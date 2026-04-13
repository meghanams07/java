class ShowroomRunner{
	public static void main(String[] args){
		
		Showroom showroom = new Showroom();

		Car c1 = new Car();
		c1.setCarId(1); c1.setBrand("Brand1"); c1.setPrice(500000);
		showroom.addCar(c1);

		Car c2 = new Car();
		c2.setCarId(2); c2.setBrand("Brand2"); c2.setPrice(600000);
		showroom.addCar(c2);

		Car c3 = new Car();
		c3.setCarId(3); c3.setBrand("Brand3"); c3.setPrice(700000);
		showroom.addCar(c3);

		Car c4 = new Car();
		c4.setCarId(4); c4.setBrand("Brand4"); c4.setPrice(800000);
		showroom.addCar(c4);

		Car c5 = new Car();
		c5.setCarId(5); c5.setBrand("Brand5"); c5.setPrice(900000);
		showroom.addCar(c5);

		Car c6 = new Car();
		c6.setCarId(6); c6.setBrand("Brand6"); c6.setPrice(1000000);
		showroom.addCar(c6);

		Car c7 = new Car();
		c7.setCarId(7); c7.setBrand("Brand7"); c7.setPrice(1100000);
		showroom.addCar(c7);

		Car c8 = new Car();
		c8.setCarId(8); c8.setBrand("Brand8"); c8.setPrice(1200000);
		showroom.addCar(c8);

		Car c9 = new Car();
		c9.setCarId(9); c9.setBrand("Brand9"); c9.setPrice(1300000);
		showroom.addCar(c9);

		Car c10 = new Car();
		c10.setCarId(10); c10.setBrand("Brand10"); c10.setPrice(1400000);
		showroom.addCar(c10);

		Car c11 = new Car();
		c11.setCarId(11); c11.setBrand("Brand11"); c11.setPrice(1500000);
		showroom.addCar(c11);

		Car c12 = new Car();
		c12.setCarId(12); c12.setBrand("Brand12"); c12.setPrice(1600000);
		showroom.addCar(c12);

		Car c13 = new Car();
		c13.setCarId(13); c13.setBrand("Brand13"); c13.setPrice(1700000);
		showroom.addCar(c13);

		Car c14 = new Car();
		c14.setCarId(14); c14.setBrand("Brand14"); c14.setPrice(1800000);
		showroom.addCar(c14);

		Car c15 = new Car();
		c15.setCarId(15); c15.setBrand("Brand15"); c15.setPrice(1900000);
		showroom.addCar(c15);

		Car c16 = new Car();
		c16.setCarId(16); c16.setBrand("Brand16"); c16.setPrice(2000000);
		showroom.addCar(c16);

		Car c17 = new Car();
		c17.setCarId(17); c17.setBrand("Brand17"); c17.setPrice(2100000);
		showroom.addCar(c17);

		Car c18 = new Car();
		c18.setCarId(18); c18.setBrand("Brand18"); c18.setPrice(2200000);
		showroom.addCar(c18);

		Car c19 = new Car();
		c19.setCarId(19); c19.setBrand("Brand19"); c19.setPrice(2300000);
		showroom.addCar(c19);

		showroom.getDetails();
	}
}