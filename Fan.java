class Fan{
    static boolean isConnected;

    static boolean onOrOff(){
        if(isConnected == false){
            isConnected = true;
            System.out.println("The fan is turned on..");
        }else{
            isConnected = false;
            System.out.println("The fan is turned off..");
        }
        return isConnected;
    }
}
