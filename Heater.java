class Heater{
    static boolean isConnected;

    static boolean onOrOff(){
        if(isConnected == false){
            isConnected = true;
            System.out.println("The heater is turned on..");
        }else{
            isConnected = false;
            System.out.println("The heater is turned off..");
        }
        return isConnected;
    }
}