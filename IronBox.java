class IronBox{
	static boolean isConnected;
	
	static boolean onOrOff(){
	if(isConnected == false){
		isConnected = true;
		System.out.println("Iron box is turned on....");
	}else if(isConnected == true){
		isConnected = false;
		System.out.println("Iron box is turned off..");
	}
	return isConnected;
	}
}