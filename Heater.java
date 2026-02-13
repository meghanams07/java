class Heater{
    boolean isConnected;
    int currentHeat = 0;
    int maxHeat = 5;
    int minHeat = 0;

    boolean onOrOff(){
        if(isConnected == false){
            isConnected = true;
            System.out.println("The heater is turned on..");
        }else{
            isConnected = false;
            System.out.println("The heater is turned off..");
        }
        return isConnected;
    }

    void increaseHeat(){
        System.out.println("increaseHeat method is invoked");
        if(isConnected == true){
            System.out.println("System is turned on proceed to increase heat");
            if(currentHeat < maxHeat){
                currentHeat += 1;
                System.out.println("Current Heat : " + currentHeat);
            }else{
                System.out.println("Heat reached to max");
            }
        }else System.out.println("Switch on first!");
    }

    void decreaseHeat(){
        System.out.println("decreaseHeat method is invoked");
        if(isConnected == true){
            System.out.println("System is turned on proceed to decrease heat");
            if(currentHeat > minHeat){
                currentHeat -= 1;
                System.out.println("Current Heat : " + currentHeat);
            }else{
                System.out.println("Heat reached to min");
            }
        }else System.out.println("Switch on first!");
    }
}
