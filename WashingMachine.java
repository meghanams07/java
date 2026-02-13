class WashingMachine{
    boolean isConnected;
    int currentLoad = 0;
    int maxLoad = 5;
    int minLoad = 0;

    boolean onOrOff(){
        if(isConnected == false){
            isConnected = true;
            System.out.println("The washing machine is turned on..");
        }else{
            isConnected = false;
            System.out.println("The washing machine is turned off..");
        }
        return isConnected;
    }

    void increaseLoad(){
        System.out.println("increaseLoad method is invoked");
        if(isConnected == true){
            System.out.println("System is turned on proceed to increase load");
            if(currentLoad < maxLoad){
                currentLoad += 1;
                System.out.println("Current Load : " + currentLoad);
            }else{
                System.out.println("Load reached to max");
            }
        }else System.out.println("Switch on first!");
    }

    void decreaseLoad(){
        System.out.println("decreaseLoad method is invoked");
        if(isConnected == true){
            System.out.println("System is turned on proceed to decrease load");
            if(currentLoad > minLoad){
                currentLoad -= 1;
                System.out.println("Current Load : " + currentLoad);
            }else{
                System.out.println("Load reached to min");
            }
        }else System.out.println("Switch on first!");
    }
}
