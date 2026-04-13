class Pvr{
	Screen screen ;
	
	public boolean addScreen(Screen screen){
		this.screen = screen;
		return true;
	}
	
	public Pvr(Screen screen){
		this.screen = screen;
	}
	
	public void getDetails(){
		System.out.println(this.screen.screenNumber);
		System.out.println(this.screen.screenType);
		System.out.println(this.screen.totalSeats);
		System.out.println(this.screen.resolution);
		System.out.println(this.screen.soundSystem);
		System.out.println(this.screen.is3D);
		System.out.println(this.screen.language);
		System.out.println(this.screen.showTime);
	}
}