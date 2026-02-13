class Speaker{
    static boolean isConnected;
    static int currentVolume = 0;
    static int maxVolume = 8;
	static int minVolume = 0;

    static boolean onOrOff(){
        if(isConnected == false){
            isConnected = true;
            System.out.println("The speaker is turned on..");
        }else{
            isConnected = false;
            System.out.println("The speaker is turned off..");
        }
        return isConnected;
    }

    public static void increaseVolume(){
        System.out.println("IncreaseVolume method is invoked");

        if(isConnected == true){
            System.out.println("System is turned on proceed to increase the volume");

            if(currentVolume < maxVolume){
                currentVolume += 1;
                System.out.println("Current Volume : " + currentVolume);
            }else{
                System.out.println("Volume reached to max");
            }
        }else{
            System.out.println("Switch on first!");
        }
    }
	
	public static void decreaseVolume(){
		System.out.println("decrese method is invoked");
		
		if(isConnected == true){
			System.out.println("Sytem is turned on proceed to decrese the volume");
			
			if(currentVolume > minVolume){
			    currentVolume -= 1;
			    System.out.println("CurrentVolume :"+currentVolume);
			}else{
				System.out.println("Volume reached to min");
				}
        }else{
            System.out.println("Switch on first!");
        }	
}
}