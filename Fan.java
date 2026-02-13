class Fan{
    boolean isConnected;
    int currentSpeed = 0;
    int maxSpeed = 5;
    int minSpeed = 0;

    boolean onOrOff(){
        if(isConnected == false){
            isConnected = true;
            System.out.println("The fan is turned on..");
        }else{
            isConnected = false;
            System.out.println("The fan is turned off..");
        }
        return isConnected;
    }

    void increaseSpeed(){
        System.out.println("increaseSpeed method is invoked");
        if(isConnected == true){
            System.out.println("System is turned on proceed to increase speed");
            if(currentSpeed < maxSpeed){
                currentSpeed += 1;
                System.out.println("Current Speed : " + currentSpeed);
            }else{
                System.out.println("Speed reached to max");
            }
        }else System.out.println("Switch on first!");
    }

    void decreaseSpeed(){
        System.out.println("decreaseSpeed method is invoked");
        if(isConnected == true){
            System.out.println("System is turned on proceed to decrease speed");
            if(currentSpeed > minSpeed){
                currentSpeed -= 1;
                System.out.println("Current Speed : " + currentSpeed);
            }else{
                System.out.println("Speed reached to min");
            }
        }else System.out.println("Switch on first!");
    }
}
