class FlipkartRunner{
	public static void main(String[] args){
		
		Flipkart flipkart = new Flipkart();

		Order o1 = new Order();
		o1.setOrderId(1); o1.setProductName("Item1"); o1.setAmount(500);
		flipkart.addOrder(o1);

		Order o2 = new Order();
		o2.setOrderId(2); o2.setProductName("Item2"); o2.setAmount(800);
		flipkart.addOrder(o2);

		Order o3 = new Order();
		o3.setOrderId(3); o3.setProductName("Item3"); o3.setAmount(1200);
		flipkart.addOrder(o3);

		Order o4 = new Order();
		o4.setOrderId(4); o4.setProductName("Item4"); o4.setAmount(1500);
		flipkart.addOrder(o4);

		Order o5 = new Order();
		o5.setOrderId(5); o5.setProductName("Item5"); o5.setAmount(2000);
		flipkart.addOrder(o5);

		Order o6 = new Order();
		o6.setOrderId(6); o6.setProductName("Item6"); o6.setAmount(2200);
		flipkart.addOrder(o6);

		Order o7 = new Order();
		o7.setOrderId(7); o7.setProductName("Item7"); o7.setAmount(2500);
		flipkart.addOrder(o7);

		Order o8 = new Order();
		o8.setOrderId(8); o8.setProductName("Item8"); o8.setAmount(2800);
		flipkart.addOrder(o8);

		Order o9 = new Order();
		o9.setOrderId(9); o9.setProductName("Item9"); o9.setAmount(3000);
		flipkart.addOrder(o9);

		Order o10 = new Order();
		o10.setOrderId(10); o10.setProductName("Item10"); o10.setAmount(3500);
		flipkart.addOrder(o10);

		Order o11 = new Order();
		o11.setOrderId(11); o11.setProductName("Item11"); o11.setAmount(3800);
		flipkart.addOrder(o11);

		Order o12 = new Order();
		o12.setOrderId(12); o12.setProductName("Item12"); o12.setAmount(4000);
		flipkart.addOrder(o12);

		Order o13 = new Order();
		o13.setOrderId(13); o13.setProductName("Item13"); o13.setAmount(4200);
		flipkart.addOrder(o13);

		Order o14 = new Order();
		o14.setOrderId(14); o14.setProductName("Item14"); o14.setAmount(4500);
		flipkart.addOrder(o14);

		Order o15 = new Order();
		o15.setOrderId(15); o15.setProductName("Item15"); o15.setAmount(4800);
		flipkart.addOrder(o15);

		Order o16 = new Order();
		o16.setOrderId(16); o16.setProductName("Item16"); o16.setAmount(5000);
		flipkart.addOrder(o16);

		Order o17 = new Order();
		o17.setOrderId(17); o17.setProductName("Item17"); o17.setAmount(5200);
		flipkart.addOrder(o17);

		Order o18 = new Order();
		o18.setOrderId(18); o18.setProductName("Item18"); o18.setAmount(5500);
		flipkart.addOrder(o18);

		Order o19 = new Order();
		o19.setOrderId(19); o19.setProductName("Item19"); o19.setAmount(6000);
		flipkart.addOrder(o19);

		flipkart.getDetails();
	}
}