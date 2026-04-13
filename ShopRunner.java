class ShopRunner{
	public static void main(String[] args){
		
		Shop shop = new Shop();

		Mobile m1 = new Mobile();
		m1.setMobileId(1); m1.setBrand("Brand1"); m1.setPrice(10000);
		shop.addMobile(m1);

		Mobile m2 = new Mobile();
		m2.setMobileId(2); m2.setBrand("Brand2"); m2.setPrice(12000);
		shop.addMobile(m2);

		Mobile m3 = new Mobile();
		m3.setMobileId(3); m3.setBrand("Brand3"); m3.setPrice(15000);
		shop.addMobile(m3);

		Mobile m4 = new Mobile();
		m4.setMobileId(4); m4.setBrand("Brand4"); m4.setPrice(18000);
		shop.addMobile(m4);

		Mobile m5 = new Mobile();
		m5.setMobileId(5); m5.setBrand("Brand5"); m5.setPrice(20000);
		shop.addMobile(m5);

		Mobile m6 = new Mobile();
		m6.setMobileId(6); m6.setBrand("Brand6"); m6.setPrice(22000);
		shop.addMobile(m6);

		Mobile m7 = new Mobile();
		m7.setMobileId(7); m7.setBrand("Brand7"); m7.setPrice(25000);
		shop.addMobile(m7);

		Mobile m8 = new Mobile();
		m8.setMobileId(8); m8.setBrand("Brand8"); m8.setPrice(28000);
		shop.addMobile(m8);

		Mobile m9 = new Mobile();
		m9.setMobileId(9); m9.setBrand("Brand9"); m9.setPrice(30000);
		shop.addMobile(m9);

		Mobile m10 = new Mobile();
		m10.setMobileId(10); m10.setBrand("Brand10"); m10.setPrice(32000);
		shop.addMobile(m10);

		Mobile m11 = new Mobile();
		m11.setMobileId(11); m11.setBrand("Brand11"); m11.setPrice(35000);
		shop.addMobile(m11);

		Mobile m12 = new Mobile();
		m12.setMobileId(12); m12.setBrand("Brand12"); m12.setPrice(38000);
		shop.addMobile(m12);

		Mobile m13 = new Mobile();
		m13.setMobileId(13); m13.setBrand("Brand13"); m13.setPrice(40000);
		shop.addMobile(m13);

		Mobile m14 = new Mobile();
		m14.setMobileId(14); m14.setBrand("Brand14"); m14.setPrice(42000);
		shop.addMobile(m14);

		Mobile m15 = new Mobile();
		m15.setMobileId(15); m15.setBrand("Brand15"); m15.setPrice(45000);
		shop.addMobile(m15);

		Mobile m16 = new Mobile();
		m16.setMobileId(16); m16.setBrand("Brand16"); m16.setPrice(48000);
		shop.addMobile(m16);

		Mobile m17 = new Mobile();
		m17.setMobileId(17); m17.setBrand("Brand17"); m17.setPrice(50000);
		shop.addMobile(m17);

		Mobile m18 = new Mobile();
		m18.setMobileId(18); m18.setBrand("Brand18"); m18.setPrice(52000);
		shop.addMobile(m18);

		Mobile m19 = new Mobile();
		m19.setMobileId(19); m19.setBrand("Brand19"); m19.setPrice(55000);
		shop.addMobile(m19);

		shop.getDetails();
	}
}