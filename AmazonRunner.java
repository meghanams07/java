class AmazonRunner{
	public static void main(String[] args){
		
		Amazon amazon = new Amazon();

		Product p1 = new Product();
		p1.setProductId(1); p1.setProductName("Product1"); p1.setPrice(100);
		amazon.addProduct(p1);

		Product p2 = new Product();
		p2.setProductId(2); p2.setProductName("Product2"); p2.setPrice(200);
		amazon.addProduct(p2);

		Product p3 = new Product();
		p3.setProductId(3); p3.setProductName("Product3"); p3.setPrice(300);
		amazon.addProduct(p3);

		Product p4 = new Product();
		p4.setProductId(4); p4.setProductName("Product4"); p4.setPrice(400);
		amazon.addProduct(p4);

		Product p5 = new Product();
		p5.setProductId(5); p5.setProductName("Product5"); p5.setPrice(500);
		amazon.addProduct(p5);

		Product p6 = new Product();
		p6.setProductId(6); p6.setProductName("Product6"); p6.setPrice(600);
		amazon.addProduct(p6);

		Product p7 = new Product();
		p7.setProductId(7); p7.setProductName("Product7"); p7.setPrice(700);
		amazon.addProduct(p7);

		Product p8 = new Product();
		p8.setProductId(8); p8.setProductName("Product8"); p8.setPrice(800);
		amazon.addProduct(p8);

		Product p9 = new Product();
		p9.setProductId(9); p9.setProductName("Product9"); p9.setPrice(900);
		amazon.addProduct(p9);

		Product p10 = new Product();
		p10.setProductId(10); p10.setProductName("Product10"); p10.setPrice(1000);
		amazon.addProduct(p10);

		Product p11 = new Product();
		p11.setProductId(11); p11.setProductName("Product11"); p11.setPrice(1100);
		amazon.addProduct(p11);

		Product p12 = new Product();
		p12.setProductId(12); p12.setProductName("Product12"); p12.setPrice(1200);
		amazon.addProduct(p12);

		Product p13 = new Product();
		p13.setProductId(13); p13.setProductName("Product13"); p13.setPrice(1300);
		amazon.addProduct(p13);

		Product p14 = new Product();
		p14.setProductId(14); p14.setProductName("Product14"); p14.setPrice(1400);
		amazon.addProduct(p14);

		Product p15 = new Product();
		p15.setProductId(15); p15.setProductName("Product15"); p15.setPrice(1500);
		amazon.addProduct(p15);

		Product p16 = new Product();
		p16.setProductId(16); p16.setProductName("Product16"); p16.setPrice(1600);
		amazon.addProduct(p16);

		Product p17 = new Product();
		p17.setProductId(17); p17.setProductName("Product17"); p17.setPrice(1700);
		amazon.addProduct(p17);

		Product p18 = new Product();
		p18.setProductId(18); p18.setProductName("Product18"); p18.setPrice(1800);
		amazon.addProduct(p18);

		Product p19 = new Product();
		p19.setProductId(19); p19.setProductName("Product19"); p19.setPrice(1900);
		amazon.addProduct(p19);

		amazon.getDetails();
	}
}