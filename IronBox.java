class IronBox{
    boolean isConnected;
    int currentTemp = 0;
    int maxTemp = 5;
    int minTemp = 0;

    boolean onOrOff(){
        if(isConnected == false){
            isConnected = true;
            System.out.println("The ironbox is turned on..");
        }else{
            isConnected = false;
            System.out.println("The ironbox is turned off..");
        }
        return isConnected;
    }

    void increaseTemp(){
        System.out.println("increaseTemp method is invoked");
        if(isConnected == true){
            System.out.println("System is turned on proceed to increase temperature");
            if(currentTemp < maxTemp){
                currentTemp += 1;
                System.out.println("Current Temperature : " + currentTemp);
            }else{
                System.out.println("Temperature reached to max");
            }
        }else System.out.println("Switch on first!");
    }

    void decreaseTemp(){
        System.out.println("decreaseTemp method is invoked");
        if(isConnected == true){
            System.out.println("System is turned on proceed to decrease temperature");
            if(currentTemp > minTemp){
                currentTemp -= 1;
                System.out.println("Current Temperature : " + currentTemp);
            }else{
                System.out.println("Temperature reached to min");
            }
        }else System.out.println("Switch on first!");
    }
}
