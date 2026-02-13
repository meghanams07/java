class Light{
    boolean isConnected;
    int currentBrightness = 0;
    int maxBrightness = 5;
    int minBrightness = 0;

    boolean onOrOff(){
        if(isConnected == false){
            isConnected = true;
            System.out.println("The light is turned on..");
        }else{
            isConnected = false;
            System.out.println("The light is turned off..");
        }
        return isConnected;
    }

    void increaseBrightness(){
        System.out.println("increaseBrightness method is invoked");
        if(isConnected == true){
            System.out.println("System is turned on proceed to increase brightness");
            if(currentBrightness < maxBrightness){
                currentBrightness += 1;
                System.out.println("Current Brightness : " + currentBrightness);
            }else{
                System.out.println("Brightness reached to max");
            }
        }else System.out.println("Switch on first!");
    }

    void decreaseBrightness(){
        System.out.println("decreaseBrightness method is invoked");
        if(isConnected == true){
            System.out.println("System is turned on proceed to decrease brightness");
            if(currentBrightness > minBrightness){
                currentBrightness -= 1;
                System.out.println("Current Brightness : " + currentBrightness);
            }else{
                System.out.println("Brightness reached to min");
            }
        }else System.out.println("Switch on first!");
    }
}
