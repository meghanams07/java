class Garden{
	Flower flower ;
	
	public boolean addFlower(Flower flow){
		this.flower = flow;
		return true;
	}
	
	public Garden(Flower flow){
		this.flower = flow;
	}
	
	public void getDetails(){
		System.out.println(this.flower.name);
		System.out.println(this.flower.color);
		System.out.println(this.flower.fragrance);
		System.out.println(this.flower.price);
		System.out.println(this.flower.season);
		System.out.println(this.flower.type);
	}
}
		
		
		
		
		