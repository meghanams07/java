class GardenMethodExecutor{
	public static void main(String[] args){
		Flower flow = new Flower();
		flow.name = "rose";
		flow.color = "red";
		flow.fragrance = "sweet";
		flow.season = "winter";
		flow.type = "flower";
		
		Garden gard = new Garden();
		gard.addFlower(flow);
		gard.getDetails();
	}
}
		
		
		
		
		