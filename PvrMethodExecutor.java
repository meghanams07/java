class PvrMethodExecutor{
	public static void main(String[] args){
		Screen screen = new Screen();
	    screen.screenNumber = 1;
		screen.screenType = "IMAX";
		screen.totalSeats = 200;
		screen.resolution = "4K";
		screen.soundSystem = "Dolby Atmos";
		screen.is3D = true;
		screen.language = "Tamil";
		screen.showTime = "6:00 PM";
		
		Pvr pvr = new Pvr();
		pvr.addScreen(screen);
		pvr.getDetails();
	}
}