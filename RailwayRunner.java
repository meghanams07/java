class RailwayRunner{
	public static void main(String[] args){
		
		Railway railway = new Railway();

		Train t1 = new Train();
		t1.setTrainId(1); t1.setTrainName("Train1"); t1.setDestination("Chennai");
		railway.addTrain(t1);

		Train t2 = new Train();
		t2.setTrainId(2); t2.setTrainName("Train2"); t2.setDestination("Bangalore");
		railway.addTrain(t2);

		Train t3 = new Train();
		t3.setTrainId(3); t3.setTrainName("Train3"); t3.setDestination("Delhi");
		railway.addTrain(t3);

		Train t4 = new Train();
		t4.setTrainId(4); t4.setTrainName("Train4"); t4.setDestination("Mumbai");
		railway.addTrain(t4);

		Train t5 = new Train();
		t5.setTrainId(5); t5.setTrainName("Train5"); t5.setDestination("Hyderabad");
		railway.addTrain(t5);

		Train t6 = new Train();
		t6.setTrainId(6); t6.setTrainName("Train6"); t6.setDestination("Kolkata");
		railway.addTrain(t6);

		Train t7 = new Train();
		t7.setTrainId(7); t7.setTrainName("Train7"); t7.setDestination("Goa");
		railway.addTrain(t7);

		Train t8 = new Train();
		t8.setTrainId(8); t8.setTrainName("Train8"); t8.setDestination("Pune");
		railway.addTrain(t8);

		Train t9 = new Train();
		t9.setTrainId(9); t9.setTrainName("Train9"); t9.setDestination("Jaipur");
		railway.addTrain(t9);

		Train t10 = new Train();
		t10.setTrainId(10); t10.setTrainName("Train10"); t10.setDestination("Ahmedabad");
		railway.addTrain(t10);

		Train t11 = new Train();
		t11.setTrainId(11); t11.setTrainName("Train11"); t11.setDestination("Lucknow");
		railway.addTrain(t11);

		Train t12 = new Train();
		t12.setTrainId(12); t12.setTrainName("Train12"); t12.setDestination("Bhopal");
		railway.addTrain(t12);

		Train t13 = new Train();
		t13.setTrainId(13); t13.setTrainName("Train13"); t13.setDestination("Indore");
		railway.addTrain(t13);

		Train t14 = new Train();
		t14.setTrainId(14); t14.setTrainName("Train14"); t14.setDestination("Surat");
		railway.addTrain(t14);

		Train t15 = new Train();
		t15.setTrainId(15); t15.setTrainName("Train15"); t15.setDestination("Nagpur");
		railway.addTrain(t15);

		Train t16 = new Train();
		t16.setTrainId(16); t16.setTrainName("Train16"); t16.setDestination("Mysore");
		railway.addTrain(t16);

		Train t17 = new Train();
		t17.setTrainId(17); t17.setTrainName("Train17"); t17.setDestination("Coimbatore");
		railway.addTrain(t17);

		Train t18 = new Train();
		t18.setTrainId(18); t18.setTrainName("Train18"); t18.setDestination("Trichy");
		railway.addTrain(t18);

		Train t19 = new Train();
		t19.setTrainId(19); t19.setTrainName("Train19"); t19.setDestination("Madurai");
		railway.addTrain(t19);

		railway.getDetails();
	}
}