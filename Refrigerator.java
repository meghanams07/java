class Refrigerator{
    static boolean isConnected;

    static boolean onOrOff(){
        if(isConnected == false){
            isConnected = true;
            System.out.println("The refrigerator is turned on..");
        }else{
            isConnected = false;
            System.out.println("The refrigerator is turned off..");
        }
        return isConnected;
    }
}