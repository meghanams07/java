class AirConditioner{
    boolean isConnected;
    int currentTemperature = 24;
    int maxTemperature = 30;
    int minTemperature = 16;

    boolean onOrOff(){
        if(isConnected == false){
            isConnected = true;
            System.out.println("The AC is turned on..");
        }else{
            isConnected = false;
            System.out.println("The AC is turned off..");
        }
        return isConnected;
    }

    void increaseTemperature(){
        System.out.println("increaseTemperature method is invoked");
        if(isConnected == true){
            System.out.println("System is turned on proceed to increase temperature");
            if(currentTemperature < maxTemperature){
                currentTemperature += 1;
                System.out.println("Current Temperature : " + currentTemperature);
            }else{
                System.out.println("Temperature reached to max");
            }
        }else System.out.println("Switch on first!");
    }

    void decreaseTemperature(){
        System.out.println("decreaseTemperature method is invoked");
        if(isConnected == true){
            System.out.println("System is turned on proceed to decrease temperature");
            if(currentTemperature > minTemperature){
                currentTemperature -= 1;
                System.out.println("Current Temperature : " + currentTemperature);
            }else{
                System.out.println("Temperature reached to min");
            }
        }else System.out.println("Switch on first!");
    }
}
