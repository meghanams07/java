class Refrigerator{
    boolean isConnected;
    int currentCooling = 0;
    int maxCooling = 5;
    int minCooling = 0;

    boolean onOrOff(){
        if(isConnected == false){
            isConnected = true;
            System.out.println("The refrigerator is turned on..");
        }else{
            isConnected = false;
            System.out.println("The refrigerator is turned off..");
        }
        return isConnected;
    }

    void increaseCooling(){
        System.out.println("increaseCooling method is invoked");
        if(isConnected == true){
            System.out.println("System is turned on proceed to increase cooling");
            if(currentCooling < maxCooling){
                currentCooling += 1;
                System.out.println("Current Cooling : " + currentCooling);
            }else{
                System.out.println("Cooling reached to max");
            }
        }else System.out.println("Switch on first!");
    }

    void decreaseCooling(){
        System.out.println("decreaseCooling method is invoked");
        if(isConnected == true){
            System.out.println("System is turned on proceed to decrease cooling");
            if(currentCooling > minCooling){
                currentCooling -= 1;
                System.out.println("Current Cooling : " + currentCooling);
            }else{
                System.out.println("Cooling reached to min");
            }
        }else System.out.println("Switch on first!");
    }
}
