class Light{
    static boolean isConnected;

    static boolean onOrOff(){
        if(isConnected == false){
            isConnected = true;
            System.out.println("The light is turned on..");
        }else{
            isConnected = false;
            System.out.println("The light is turned off..");
        }
        return isConnected;
    }
}