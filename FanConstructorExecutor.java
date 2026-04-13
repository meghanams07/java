class FanConstructorExecutor{
	public static void main(String[] args){
		Capacitor capacitor = new Capacitor();
		capacitor.capacitance = 2.5;
		capacitor.voltage = 440;
		capacitor.type = "AC";
		capacitor.polarity = "Non-Polarized";
		capacitor.material = "Polypropylene";
		capacitor.frequency = "50Hz";
		
		Fan fan = new Fan(capacitor);
		
		fan.getDetails();
	}
}
		