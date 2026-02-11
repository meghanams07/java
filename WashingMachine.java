class WashingMachine{
    static boolean isConnected;

    static boolean onOrOff(){
        if(isConnected == false){
            isConnected = true;
            System.out.println("The washing machine is turned on..");
        }else{
            isConnected = false;
            System.out.println("The washing machine is turned off..");
        }
        return isConnected;
    }
}