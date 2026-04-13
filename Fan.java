class Fan{
	Capacitor capacitor;
	
	public boolean fanAdded(Capacitor capacitor){
		this.capacitor = capacitor;
		return true;
	}
	
	public Fan(Capacitor capacitor){
			this.capacitor = capacitor;
	}
	
	public void getDetails(){
		System.out.println(this.capacitor.capacitance);
		System.out.println(this.capacitor.voltage);
		System.out.println(this.capacitor.type);
		System.out.println(this.capacitor.polarity);
		System.out.println(this.capacitor.material);
		System.out.println(this.capacitor.frequency);
	}
}
		
		
		
		
		
		
		
		
		
		