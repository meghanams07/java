class ShoelaceExecutor{
	public static void main(String[] args){
	
		Shoelace p1 = new Shoelace("Nike","Black","Cotton",120,150,"Flat","Plain","Medium","Sport","Flat","India","Premium","High","Strong","No","Yes","Running","Box",1,"Nike");
		Shoelace p2 = new Shoelace("Adidas","White","Polyester",115,140,"Round","Striped","Thin","Casual","Round","India","Standard","Medium","Good","No","Yes","Daily","Packet",1,"Adidas");
		Shoelace p3 = new Shoelace("Puma","Red","Cotton",118,145,"Flat","Plain","Medium","Sport","Flat","India","Premium","High","Strong","No","Yes","Training","Box",1,"Puma");
		Shoelace p4 = new Shoelace("Reebok","Blue","Nylon",117,135,"Round","Striped","Medium","Sport","Round","India","Standard","Medium","Good","No","Yes","Gym","Packet",1,"Reebok");
		Shoelace p5 = new Shoelace("Nike","Green","Cotton",120,150,"Flat","Plain","Thick","Sport","Flat","India","Premium","High","Strong","No","Yes","Running","Box",1,"Nike");
		Shoelace p6 = new Shoelace("Adidas","Black","Polyester",118,145,"Round","Plain","Medium","Sport","Round","India","Premium","High","Strong","No","Yes","Running","Box",1,"Adidas");
		Shoelace p7 = new Shoelace("Puma","White","Cotton",116,140,"Flat","Striped","Thin","Casual","Flat","India","Standard","Medium","Good","No","Yes","Daily","Packet",1,"Puma");
		Shoelace p8 = new Shoelace("Reebok","Red","Nylon",119,150,"Round","Plain","Medium","Sport","Round","India","Premium","High","Strong","No","Yes","Training","Box",1,"Reebok");
		Shoelace p9 = new Shoelace("Nike","Blue","Cotton",120,155,"Flat","Plain","Thick","Sport","Flat","India","Premium","High","Strong","No","Yes","Running","Box",1,"Nike");
		Shoelace p10 = new Shoelace("Adidas","Green","Polyester",117,145,"Round","Striped","Medium","Casual","Round","India","Standard","Medium","Good","No","Yes","Daily","Packet",1,"Adidas");
		Shoelace p11 = new Shoelace("Puma","Black","Cotton",120,150,"Flat","Plain","Medium","Sport","Flat","India","Premium","High","Strong","No","Yes","Running","Box",1,"Puma");
		Shoelace p12 = new Shoelace("Nike","White","Polyester",115,140,"Round","Striped","Thin","Casual","Round","India","Standard","Medium","Good","No","Yes","Daily","Packet",1,"Nike");
		Shoelace p13 = new Shoelace("Adidas","Red","Cotton",118,145,"Flat","Plain","Medium","Sport","Flat","India","Premium","High","Strong","No","Yes","Training","Box",1,"Adidas");
		Shoelace p14 = new Shoelace("Reebok","Blue","Nylon",117,135,"Round","Striped","Medium","Sport","Round","India","Standard","Medium","Good","No","Yes","Gym","Packet",1,"Reebok");
		Shoelace p15 = new Shoelace("Nike","Green","Cotton",120,150,"Flat","Plain","Thick","Sport","Flat","India","Premium","High","Strong","No","Yes","Running","Box",1,"Nike");
		Shoelace p16 = new Shoelace("Adidas","Black","Polyester",118,145,"Round","Plain","Medium","Sport","Round","India","Premium","High","Strong","No","Yes","Running","Box",1,"Adidas");
		Shoelace p17 = new Shoelace("Puma","White","Cotton",116,140,"Flat","Striped","Thin","Casual","Flat","India","Standard","Medium","Good","No","Yes","Daily","Packet",1,"Puma");
		Shoelace p18 = new Shoelace("Reebok","Red","Nylon",119,150,"Round","Plain","Medium","Sport","Round","India","Premium","High","Strong","No","Yes","Training","Box",1,"Reebok");
		Shoelace p19 = new Shoelace("Nike","Blue","Cotton",120,155,"Flat","Plain","Thick","Sport","Flat","India","Premium","High","Strong","No","Yes","Running","Box",1,"Nike");
		Shoelace p20 = new Shoelace("Adidas","Green","Polyester",117,145,"Round","Striped","Medium","Casual","Round","India","Standard","Medium","Good","No","Yes","Daily","Packet",1,"Adidas");

		Shoelace s1 = new Shoelace();
		s1.brand="Nike"; s1.color="Black"; s1.material="Cotton"; s1.length=120; s1.price=150;
		s1.type="Flat"; s1.pattern="Plain"; s1.thickness="Medium"; s1.style="Sport"; s1.shape="Round";
		s1.country="India"; s1.quality="Premium"; s1.flexibility="High"; s1.durability="Strong";
		s1.waterproof="No"; s1.washable="Yes"; s1.usage="Running"; s1.packaging="Box";
		s1.warranty=1; s1.manufacturer="Nike";
		System.out.println(s1.brand+" "+s1.color+" "+s1.material+" "+s1.length+" "+s1.price+" "+s1.type+" "+
		s1.pattern+" "+s1.thickness+" "+s1.style+" "+s1.shape+" "+s1.country+" "+s1.quality+" "+
		s1.flexibility+" "+s1.durability+" "+s1.waterproof+" "+s1.washable+" "+s1.usage+" "+
		s1.packaging+" "+s1.warranty+" "+s1.manufacturer);

		Shoelace s2 = new Shoelace();
		s2.brand="Adidas"; s2.color="White"; s2.material="Polyester"; s2.length=110; s2.price=140;
		s2.type="Round"; s2.pattern="Striped"; s2.thickness="Thin"; s2.style="Casual"; s2.shape="Round";
		s2.country="India"; s2.quality="Standard"; s2.flexibility="Medium"; s2.durability="Good";
		s2.waterproof="No"; s2.washable="Yes"; s2.usage="Daily"; s2.packaging="Packet";
		s2.warranty=1; s2.manufacturer="Adidas";
		System.out.println(s2.brand+" "+s2.color+" "+s2.material+" "+s2.length+" "+s2.price+" "+s2.type+" "+
		s2.pattern+" "+s2.thickness+" "+s2.style+" "+s2.shape+" "+s2.country+" "+s2.quality+" "+
		s2.flexibility+" "+s2.durability+" "+s2.waterproof+" "+s2.washable+" "+s2.usage+" "+
		s2.packaging+" "+s2.warranty+" "+s2.manufacturer);

		Shoelace s3 = new Shoelace();
		s3.brand="Puma"; s3.color="Red"; s3.material="Cotton"; s3.length=115; s3.price=130;
		s3.type="Flat"; s3.pattern="Plain"; s3.thickness="Medium"; s3.style="Sport"; s3.shape="Flat";
		s3.country="India"; s3.quality="Premium"; s3.flexibility="High"; s3.durability="Strong";
		s3.waterproof="No"; s3.washable="Yes"; s3.usage="Running"; s3.packaging="Box";
		s3.warranty=1; s3.manufacturer="Puma";
		System.out.println(s3.brand+" "+s3.color+" "+s3.material+" "+s3.length+" "+s3.price+" "+s3.type+" "+
		s3.pattern+" "+s3.thickness+" "+s3.style+" "+s3.shape+" "+s3.country+" "+s3.quality+" "+
		s3.flexibility+" "+s3.durability+" "+s3.waterproof+" "+s3.washable+" "+s3.usage+" "+
		s3.packaging+" "+s3.warranty+" "+s3.manufacturer);
		
		Shoelace s4 = new Shoelace();
		s4.brand="Reebok"; s4.color="Blue"; s4.material="Nylon"; s4.length=118; s4.price=135;
		s4.type="Round"; s4.pattern="Striped"; s4.thickness="Medium"; s4.style="Sport"; s4.shape="Round";
		s4.country="India"; s4.quality="Standard"; s4.flexibility="Medium"; s4.durability="Good";
		s4.waterproof="No"; s4.washable="Yes"; s4.usage="Training"; s4.packaging="Packet";
		s4.warranty=1; s4.manufacturer="Reebok";
		System.out.println(s4.brand+" "+s4.color+" "+s4.material+" "+s4.length+" "+s4.price+" "+s4.type+" "+
		s4.pattern+" "+s4.thickness+" "+s4.style+" "+s4.shape+" "+s4.country+" "+s4.quality+" "+
		s4.flexibility+" "+s4.durability+" "+s4.waterproof+" "+s4.washable+" "+s4.usage+" "+
		s4.packaging+" "+s4.warranty+" "+s4.manufacturer);

		Shoelace s5 = new Shoelace();
		s5.brand="Nike"; s5.color="Green"; s5.material="Cotton"; s5.length=120; s5.price=145;
		s5.type="Flat"; s5.pattern="Plain"; s5.thickness="Thick"; s5.style="Sport"; s5.shape="Flat";
		s5.country="India"; s5.quality="Premium"; s5.flexibility="High"; s5.durability="Strong";
		s5.waterproof="No"; s5.washable="Yes"; s5.usage="Running"; s5.packaging="Box";
		s5.warranty=1; s5.manufacturer="Nike";
		System.out.println(s5.brand+" "+s5.color+" "+s5.material+" "+s5.length+" "+s5.price+" "+s5.type+" "+
		s5.pattern+" "+s5.thickness+" "+s5.style+" "+s5.shape+" "+s5.country+" "+s5.quality+" "+
		s5.flexibility+" "+s5.durability+" "+s5.waterproof+" "+s5.washable+" "+s5.usage+" "+
		s5.packaging+" "+s5.warranty+" "+s5.manufacturer);

		Shoelace s6 = new Shoelace();
		s6.brand="Adidas"; s6.color="Yellow"; s6.material="Polyester"; s6.length=112; s6.price=138;
		s6.type="Round"; s6.pattern="Plain"; s6.thickness="Thin"; s6.style="Casual"; s6.shape="Round";
		s6.country="India"; s6.quality="Standard"; s6.flexibility="Medium"; s6.durability="Good";
		s6.waterproof="No"; s6.washable="Yes"; s6.usage="Daily"; s6.packaging="Packet";
		s6.warranty=1; s6.manufacturer="Adidas";
		System.out.println(s6.brand+" "+s6.color+" "+s6.material+" "+s6.length+" "+s6.price+" "+s6.type+" "+
		s6.pattern+" "+s6.thickness+" "+s6.style+" "+s6.shape+" "+s6.country+" "+s6.quality+" "+
		s6.flexibility+" "+s6.durability+" "+s6.waterproof+" "+s6.washable+" "+s6.usage+" "+
		s6.packaging+" "+s6.warranty+" "+s6.manufacturer);
		
		Shoelace s7 = new Shoelace();
		s7.brand="Puma"; s7.color="Black"; s7.material="Cotton"; s7.length=120; s7.price=150;
		s7.type="Flat"; s7.pattern="Plain"; s7.thickness="Medium"; s7.style="Sport"; s7.shape="Flat";
		s7.country="India"; s7.quality="Premium"; s7.flexibility="High"; s7.durability="Strong";
		s7.waterproof="No"; s7.washable="Yes"; s7.usage="Running"; s7.packaging="Box";
		s7.warranty=1; s7.manufacturer="Puma";
		System.out.println(s7.brand+" "+s7.color+" "+s7.material+" "+s7.length+" "+s7.price+" "+s7.type+" "+
		s7.pattern+" "+s7.thickness+" "+s7.style+" "+s7.shape+" "+s7.country+" "+s7.quality+" "+
		s7.flexibility+" "+s7.durability+" "+s7.waterproof+" "+s7.washable+" "+s7.usage+" "+
		s7.packaging+" "+s7.warranty+" "+s7.manufacturer);

		Shoelace s8 = new Shoelace();
		s8.brand="Nike"; s8.color="White"; s8.material="Polyester"; s8.length=115; s8.price=140;
		s8.type="Round"; s8.pattern="Striped"; s8.thickness="Thin"; s8.style="Casual"; s8.shape="Round";
		s8.country="India"; s8.quality="Standard"; s8.flexibility="Medium"; s8.durability="Good";
		s8.waterproof="No"; s8.washable="Yes"; s8.usage="Daily"; s8.packaging="Packet";
		s8.warranty=1; s8.manufacturer="Nike";
		System.out.println(s8.brand+" "+s8.color+" "+s8.material+" "+s8.length+" "+s8.price+" "+s8.type+" "+
		s8.pattern+" "+s8.thickness+" "+s8.style+" "+s8.shape+" "+s8.country+" "+s8.quality+" "+
		s8.flexibility+" "+s8.durability+" "+s8.waterproof+" "+s8.washable+" "+s8.usage+" "+
		s8.packaging+" "+s8.warranty+" "+s8.manufacturer);

		Shoelace s9 = new Shoelace();
		s9.brand="Adidas"; s9.color="Red"; s9.material="Cotton"; s9.length=118; s9.price=145;
		s9.type="Flat"; s9.pattern="Plain"; s9.thickness="Medium"; s9.style="Sport"; s9.shape="Flat";
		s9.country="India"; s9.quality="Premium"; s9.flexibility="High"; s9.durability="Strong";
		s9.waterproof="No"; s9.washable="Yes"; s9.usage="Training"; s9.packaging="Box";
		s9.warranty=1; s9.manufacturer="Adidas";
		System.out.println(s9.brand+" "+s9.color+" "+s9.material+" "+s9.length+" "+s9.price+" "+s9.type+" "+
		s9.pattern+" "+s9.thickness+" "+s9.style+" "+s9.shape+" "+s9.country+" "+s9.quality+" "+
		s9.flexibility+" "+s9.durability+" "+s9.waterproof+" "+s9.washable+" "+s9.usage+" "+
		s9.packaging+" "+s9.warranty+" "+s9.manufacturer);

		Shoelace s10 = new Shoelace();
		s10.brand="Reebok"; s10.color="Blue"; s10.material="Nylon"; s10.length=117; s10.price=135;
		s10.type="Round"; s10.pattern="Striped"; s10.thickness="Medium"; s10.style="Sport"; s10.shape="Round";
		s10.country="India"; s10.quality="Standard"; s10.flexibility="Medium"; s10.durability="Good";
		s10.waterproof="No"; s10.washable="Yes"; s10.usage="Gym"; s10.packaging="Packet";
		s10.warranty=1; s10.manufacturer="Reebok";
		System.out.println(s10.brand+" "+s10.color+" "+s10.material+" "+s10.length+" "+s10.price+" "+s10.type+" "+
		s10.pattern+" "+s10.thickness+" "+s10.style+" "+s10.shape+" "+s10.country+" "+s10.quality+" "+
		s10.flexibility+" "+s10.durability+" "+s10.waterproof+" "+s10.washable+" "+s10.usage+" "+
		s10.packaging+" "+s10.warranty+" "+s10.manufacturer);
		
		Shoelace s11 = new Shoelace();
		s11.brand="Nike"; s11.color="Black"; s11.material="Cotton"; s11.length=120; s11.price=150;
		s11.type="Flat"; s11.pattern="Plain"; s11.thickness="Medium"; s11.style="Sport"; s11.shape="Flat";
		s11.country="India"; s11.quality="Premium"; s11.flexibility="High"; s11.durability="Strong";
		s11.waterproof="No"; s11.washable="Yes"; s11.usage="Running"; s11.packaging="Box";
		s11.warranty=1; s11.manufacturer="Nike";
		System.out.println(s11.brand+" "+s11.color+" "+s11.material+" "+s11.length+" "+s11.price+" "+s11.type+" "+
		s11.pattern+" "+s11.thickness+" "+s11.style+" "+s11.shape+" "+s11.country+" "+s11.quality+" "+
		s11.flexibility+" "+s11.durability+" "+s11.waterproof+" "+s11.washable+" "+s11.usage+" "+
		s11.packaging+" "+s11.warranty+" "+s11.manufacturer);

		Shoelace s12 = new Shoelace();
		s12.brand="Adidas"; s12.color="White"; s12.material="Polyester"; s12.length=115; s12.price=140;
		s12.type="Round"; s12.pattern="Striped"; s12.thickness="Thin"; s12.style="Casual"; s12.shape="Round";
		s12.country="India"; s12.quality="Standard"; s12.flexibility="Medium"; s12.durability="Good";
		s12.waterproof="No"; s12.washable="Yes"; s12.usage="Daily"; s12.packaging="Packet";
		s12.warranty=1; s12.manufacturer="Adidas";
		System.out.println(s12.brand+" "+s12.color+" "+s12.material+" "+s12.length+" "+s12.price+" "+s12.type+" "+
		s12.pattern+" "+s12.thickness+" "+s12.style+" "+s12.shape+" "+s12.country+" "+s12.quality+" "+
		s12.flexibility+" "+s12.durability+" "+s12.waterproof+" "+s12.washable+" "+s12.usage+" "+
		s12.packaging+" "+s12.warranty+" "+s12.manufacturer);

		Shoelace s13 = new Shoelace();
		s13.brand="Puma"; s13.color="Red"; s13.material="Cotton"; s13.length=118; s13.price=145;
		s13.type="Flat"; s13.pattern="Plain"; s13.thickness="Medium"; s13.style="Sport"; s13.shape="Flat";
		s13.country="India"; s13.quality="Premium"; s13.flexibility="High"; s13.durability="Strong";
		s13.waterproof="No"; s13.washable="Yes"; s13.usage="Training"; s13.packaging="Box";
		s13.warranty=1; s13.manufacturer="Puma";
		System.out.println(s13.brand+" "+s13.color+" "+s13.material+" "+s13.length+" "+s13.price+" "+s13.type+" "+
		s13.pattern+" "+s13.thickness+" "+s13.style+" "+s13.shape+" "+s13.country+" "+s13.quality+" "+
		s13.flexibility+" "+s13.durability+" "+s13.waterproof+" "+s13.washable+" "+s13.usage+" "+
		s13.packaging+" "+s13.warranty+" "+s13.manufacturer);

		Shoelace s14 = new Shoelace();
		s14.brand="Reebok"; s14.color="Blue"; s14.material="Nylon"; s14.length=117; s14.price=135;
		s14.type="Round"; s14.pattern="Striped"; s14.thickness="Medium"; s14.style="Sport"; s14.shape="Round";
		s14.country="India"; s14.quality="Standard"; s14.flexibility="Medium"; s14.durability="Good";
		s14.waterproof="No"; s14.washable="Yes"; s14.usage="Gym"; s14.packaging="Packet";
		s14.warranty=1; s14.manufacturer="Reebok";
		System.out.println(s14.brand+" "+s14.color+" "+s14.material+" "+s14.length+" "+s14.price+" "+s14.type+" "+
		s14.pattern+" "+s14.thickness+" "+s14.style+" "+s14.shape+" "+s14.country+" "+s14.quality+" "+
		s14.flexibility+" "+s14.durability+" "+s14.waterproof+" "+s14.washable+" "+s14.usage+" "+
		s14.packaging+" "+s14.warranty+" "+s14.manufacturer);

		Shoelace s15 = new Shoelace();
		s15.brand="Nike"; s15.color="Green"; s15.material="Cotton"; s15.length=120; s15.price=150;
		s15.type="Flat"; s15.pattern="Plain"; s15.thickness="Thick"; s15.style="Sport"; s15.shape="Flat";
		s15.country="India"; s15.quality="Premium"; s15.flexibility="High"; s15.durability="Strong";
		s15.waterproof="No"; s15.washable="Yes"; s15.usage="Running"; s15.packaging="Box";
		s15.warranty=1; s15.manufacturer="Nike";
		System.out.println(s15.brand+" "+s15.color+" "+s15.material+" "+s15.length+" "+s15.price+" "+s15.type+" "+
		s15.pattern+" "+s15.thickness+" "+s15.style+" "+s15.shape+" "+s15.country+" "+s15.quality+" "+
		s15.flexibility+" "+s15.durability+" "+s15.waterproof+" "+s15.washable+" "+s15.usage+" "+
		s15.packaging+" "+s15.warranty+" "+s15.manufacturer);
		
		Shoelace s16 = new Shoelace();
		s16.brand="Adidas"; s16.color="Black"; s16.material="Polyester"; s16.length=118; s16.price=145;
		s16.type="Round"; s16.pattern="Plain"; s16.thickness="Medium"; s16.style="Sport"; s16.shape="Round";
		s16.country="India"; s16.quality="Premium"; s16.flexibility="High"; s16.durability="Strong";
		s16.waterproof="No"; s16.washable="Yes"; s16.usage="Running"; s16.packaging="Box";
		s16.warranty=1; s16.manufacturer="Adidas";
		System.out.println(s16.brand+" "+s16.color+" "+s16.material+" "+s16.length+" "+s16.price+" "+s16.type+" "+
		s16.pattern+" "+s16.thickness+" "+s16.style+" "+s16.shape+" "+s16.country+" "+s16.quality+" "+
		s16.flexibility+" "+s16.durability+" "+s16.waterproof+" "+s16.washable+" "+s16.usage+" "+
		s16.packaging+" "+s16.warranty+" "+s16.manufacturer);

		Shoelace s17 = new Shoelace();
		s17.brand="Puma"; s17.color="White"; s17.material="Cotton"; s17.length=116; s17.price=140;
		s17.type="Flat"; s17.pattern="Striped"; s17.thickness="Thin"; s17.style="Casual"; s17.shape="Flat";
		s17.country="India"; s17.quality="Standard"; s17.flexibility="Medium"; s17.durability="Good";
		s17.waterproof="No"; s17.washable="Yes"; s17.usage="Daily"; s17.packaging="Packet";
		s17.warranty=1; s17.manufacturer="Puma";
		System.out.println(s17.brand+" "+s17.color+" "+s17.material+" "+s17.length+" "+s17.price+" "+s17.type+" "+
		s17.pattern+" "+s17.thickness+" "+s17.style+" "+s17.shape+" "+s17.country+" "+s17.quality+" "+
		s17.flexibility+" "+s17.durability+" "+s17.waterproof+" "+s17.washable+" "+s17.usage+" "+
		s17.packaging+" "+s17.warranty+" "+s17.manufacturer);

		Shoelace s18 = new Shoelace();
		s18.brand="Reebok"; s18.color="Red"; s18.material="Nylon"; s18.length=119; s18.price=150;
		s18.type="Round"; s18.pattern="Plain"; s18.thickness="Medium"; s18.style="Sport"; s18.shape="Round";
		s18.country="India"; s18.quality="Premium"; s18.flexibility="High"; s18.durability="Strong";
		s18.waterproof="No"; s18.washable="Yes"; s18.usage="Training"; s18.packaging="Box";
		s18.warranty=1; s18.manufacturer="Reebok";
		System.out.println(s18.brand+" "+s18.color+" "+s18.material+" "+s18.length+" "+s18.price+" "+s18.type+" "+
		s18.pattern+" "+s18.thickness+" "+s18.style+" "+s18.shape+" "+s18.country+" "+s18.quality+" "+
		s18.flexibility+" "+s18.durability+" "+s18.waterproof+" "+s18.washable+" "+s18.usage+" "+
		s18.packaging+" "+s18.warranty+" "+s18.manufacturer);

		Shoelace s19 = new Shoelace();
		s19.brand="Nike"; s19.color="Blue"; s19.material="Cotton"; s19.length=120; s19.price=155;
		s19.type="Flat"; s19.pattern="Plain"; s19.thickness="Thick"; s19.style="Sport"; s19.shape="Flat";
		s19.country="India"; s19.quality="Premium"; s19.flexibility="High"; s19.durability="Strong";
		s19.waterproof="No"; s19.washable="Yes"; s19.usage="Running"; s19.packaging="Box";
		s19.warranty=1; s19.manufacturer="Nike";
		System.out.println(s19.brand+" "+s19.color+" "+s19.material+" "+s19.length+" "+s19.price+" "+s19.type+" "+
		s19.pattern+" "+s19.thickness+" "+s19.style+" "+s19.shape+" "+s19.country+" "+s19.quality+" "+
		s19.flexibility+" "+s19.durability+" "+s19.waterproof+" "+s19.washable+" "+s19.usage+" "+
		s19.packaging+" "+s19.warranty+" "+s19.manufacturer);

		Shoelace s20 = new Shoelace();
		s20.brand="Adidas"; s20.color="Green"; s20.material="Polyester"; s20.length=117; s20.price=145;
		s20.type="Round"; s20.pattern="Striped"; s20.thickness="Medium"; s20.style="Casual"; s20.shape="Round";
		s20.country="India"; s20.quality="Standard"; s20.flexibility="Medium"; s20.durability="Good";
		s20.waterproof="No"; s20.washable="Yes"; s20.usage="Daily"; s20.packaging="Packet";
		s20.warranty=1; s20.manufacturer="Adidas";
		System.out.println(s20.brand+" "+s20.color+" "+s20.material+" "+s20.length+" "+s20.price+" "+s20.type+" "+
		s20.pattern+" "+s20.thickness+" "+s20.style+" "+s20.shape+" "+s20.country+" "+s20.quality+" "+
		s20.flexibility+" "+s20.durability+" "+s20.waterproof+" "+s20.washable+" "+s20.usage+" "+
		s20.packaging+" "+s20.warranty+" "+s20.manufacturer);
		
		Shoelace s21 = new Shoelace();
		s21.brand="Puma"; s21.color="Black"; s21.material="Cotton"; s21.length=120; s21.price=150;
		s21.type="Flat"; s21.pattern="Plain"; s21.thickness="Medium"; s21.style="Sport"; s21.shape="Flat";
		s21.country="India"; s21.quality="Premium"; s21.flexibility="High"; s21.durability="Strong";
		s21.waterproof="No"; s21.washable="Yes"; s21.usage="Running"; s21.packaging="Box";
		s21.warranty=1; s21.manufacturer="Puma";
		System.out.println(s21.brand+" "+s21.color+" "+s21.material+" "+s21.length+" "+s21.price+" "+s21.type+" "+
		s21.pattern+" "+s21.thickness+" "+s21.style+" "+s21.shape+" "+s21.country+" "+s21.quality+" "+
		s21.flexibility+" "+s21.durability+" "+s21.waterproof+" "+s21.washable+" "+s21.usage+" "+
		s21.packaging+" "+s21.warranty+" "+s21.manufacturer);

		Shoelace s22 = new Shoelace();
		s22.brand="Nike"; s22.color="White"; s22.material="Polyester"; s22.length=118; s22.price=145;
		s22.type="Round"; s22.pattern="Striped"; s22.thickness="Thin"; s22.style="Casual"; s22.shape="Round";
		s22.country="India"; s22.quality="Standard"; s22.flexibility="Medium"; s22.durability="Good";
		s22.waterproof="No"; s22.washable="Yes"; s22.usage="Daily"; s22.packaging="Packet";
		s22.warranty=1; s22.manufacturer="Nike";
		System.out.println(s22.brand+" "+s22.color+" "+s22.material+" "+s22.length+" "+s22.price+" "+s22.type+" "+
		s22.pattern+" "+s22.thickness+" "+s22.style+" "+s22.shape+" "+s22.country+" "+s22.quality+" "+
		s22.flexibility+" "+s22.durability+" "+s22.waterproof+" "+s22.washable+" "+s22.usage+" "+
		s22.packaging+" "+s22.warranty+" "+s22.manufacturer);

		Shoelace s23 = new Shoelace();
		s23.brand="Adidas"; s23.color="Red"; s23.material="Cotton"; s23.length=119; s23.price=150;
		s23.type="Flat"; s23.pattern="Plain"; s23.thickness="Medium"; s23.style="Sport"; s23.shape="Flat";
		s23.country="India"; s23.quality="Premium"; s23.flexibility="High"; s23.durability="Strong";
		s23.waterproof="No"; s23.washable="Yes"; s23.usage="Training"; s23.packaging="Box";
		s23.warranty=1; s23.manufacturer="Adidas";
		System.out.println(s23.brand+" "+s23.color+" "+s23.material+" "+s23.length+" "+s23.price+" "+s23.type+" "+
		s23.pattern+" "+s23.thickness+" "+s23.style+" "+s23.shape+" "+s23.country+" "+s23.quality+" "+
		s23.flexibility+" "+s23.durability+" "+s23.waterproof+" "+s23.washable+" "+s23.usage+" "+
		s23.packaging+" "+s23.warranty+" "+s23.manufacturer);

		Shoelace s24 = new Shoelace();
		s24.brand="Reebok"; s24.color="Blue"; s24.material="Nylon"; s24.length=117; s24.price=140;
		s24.type="Round"; s24.pattern="Striped"; s24.thickness="Medium"; s24.style="Sport"; s24.shape="Round";
		s24.country="India"; s24.quality="Standard"; s24.flexibility="Medium"; s24.durability="Good";
		s24.waterproof="No"; s24.washable="Yes"; s24.usage="Gym"; s24.packaging="Packet";
		s24.warranty=1; s24.manufacturer="Reebok";
		System.out.println(s24.brand+" "+s24.color+" "+s24.material+" "+s24.length+" "+s24.price+" "+s24.type+" "+
		s24.pattern+" "+s24.thickness+" "+s24.style+" "+s24.shape+" "+s24.country+" "+s24.quality+" "+
		s24.flexibility+" "+s24.durability+" "+s24.waterproof+" "+s24.washable+" "+s24.usage+" "+
		s24.packaging+" "+s24.warranty+" "+s24.manufacturer);

		Shoelace s25 = new Shoelace();
		s25.brand="Nike"; s25.color="Green"; s25.material="Cotton"; s25.length=120; s25.price=155;
		s25.type="Flat"; s25.pattern="Plain"; s25.thickness="Thick"; s25.style="Sport"; s25.shape="Flat";
		s25.country="India"; s25.quality="Premium"; s25.flexibility="High"; s25.durability="Strong";
		s25.waterproof="No"; s25.washable="Yes"; s25.usage="Running"; s25.packaging="Box";
		s25.warranty=1; s25.manufacturer="Nike";
		System.out.println(s25.brand+" "+s25.color+" "+s25.material+" "+s25.length+" "+s25.price+" "+s25.type+" "+
		s25.pattern+" "+s25.thickness+" "+s25.style+" "+s25.shape+" "+s25.country+" "+s25.quality+" "+
		s25.flexibility+" "+s25.durability+" "+s25.waterproof+" "+s25.washable+" "+s25.usage+" "+
		s25.packaging+" "+s25.warranty+" "+s25.manufacturer);
		