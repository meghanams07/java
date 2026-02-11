class AirConditioner{
    static boolean isConnected;

    static boolean onOrOff(){
        if(isConnected == false){
            isConnected = true;
            System.out.println("The AC is turned on..");
        }else{
            isConnected = false;
            System.out.println("The AC is turned off..");
        }
        return isConnected;
    }
}