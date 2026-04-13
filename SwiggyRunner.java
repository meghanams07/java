class SwiggyRunner{
	public static void main(String[] args){
		
		Swiggy swiggy = new Swiggy();

		FoodItem f1 = new FoodItem();
		f1.setFoodId(1); f1.setFoodName("Food1"); f1.setPrice(100);
		swiggy.addFoodItem(f1);

		FoodItem f2 = new FoodItem();
		f2.setFoodId(2); f2.setFoodName("Food2"); f2.setPrice(150);
		swiggy.addFoodItem(f2);

		FoodItem f3 = new FoodItem();
		f3.setFoodId(3); f3.setFoodName("Food3"); f3.setPrice(200);
		swiggy.addFoodItem(f3);

		FoodItem f4 = new FoodItem();
		f4.setFoodId(4); f4.setFoodName("Food4"); f4.setPrice(250);
		swiggy.addFoodItem(f4);

		FoodItem f5 = new FoodItem();
		f5.setFoodId(5); f5.setFoodName("Food5"); f5.setPrice(300);
		swiggy.addFoodItem(f5);

		FoodItem f6 = new FoodItem();
		f6.setFoodId(6); f6.setFoodName("Food6"); f6.setPrice(350);
		swiggy.addFoodItem(f6);

		FoodItem f7 = new FoodItem();
		f7.setFoodId(7); f7.setFoodName("Food7"); f7.setPrice(400);
		swiggy.addFoodItem(f7);

		FoodItem f8 = new FoodItem();
		f8.setFoodId(8); f8.setFoodName("Food8"); f8.setPrice(450);
		swiggy.addFoodItem(f8);

		FoodItem f9 = new FoodItem();
		f9.setFoodId(9); f9.setFoodName("Food9"); f9.setPrice(500);
		swiggy.addFoodItem(f9);

		FoodItem f10 = new FoodItem();
		f10.setFoodId(10); f10.setFoodName("Food10"); f10.setPrice(550);
		swiggy.addFoodItem(f10);

		FoodItem f11 = new FoodItem();
		f11.setFoodId(11); f11.setFoodName("Food11"); f11.setPrice(600);
		swiggy.addFoodItem(f11);

		FoodItem f12 = new FoodItem();
		f12.setFoodId(12); f12.setFoodName("Food12"); f12.setPrice(650);
		swiggy.addFoodItem(f12);

		FoodItem f13 = new FoodItem();
		f13.setFoodId(13); f13.setFoodName("Food13"); f13.setPrice(700);
		swiggy.addFoodItem(f13);

		FoodItem f14 = new FoodItem();
		f14.setFoodId(14); f14.setFoodName("Food14"); f14.setPrice(750);
		swiggy.addFoodItem(f14);

		FoodItem f15 = new FoodItem();
		f15.setFoodId(15); f15.setFoodName("Food15"); f15.setPrice(800);
		swiggy.addFoodItem(f15);

		FoodItem f16 = new FoodItem();
		f16.setFoodId(16); f16.setFoodName("Food16"); f16.setPrice(850);
		swiggy.addFoodItem(f16);

		FoodItem f17 = new FoodItem();
		f17.setFoodId(17); f17.setFoodName("Food17"); f17.setPrice(900);
		swiggy.addFoodItem(f17);

		FoodItem f18 = new FoodItem();
		f18.setFoodId(18); f18.setFoodName("Food18"); f18.setPrice(950);
		swiggy.addFoodItem(f18);

		FoodItem f19 = new FoodItem();
		f19.setFoodId(19); f19.setFoodName("Food19"); f19.setPrice(1000);
		swiggy.addFoodItem(f19);

		swiggy.getDetails();
	}
}