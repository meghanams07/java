class Mixer{
    static boolean isConnected;

    static boolean onOrOff(){
        if(isConnected == false){
            isConnected = true;
            System.out.println("The mixer is turned on..");
        }else{
            isConnected = false;
            System.out.println("The mixer is turned off..");
        }
        return isConnected;
    }
}