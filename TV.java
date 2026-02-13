class Tv{
    boolean isConnected;
    int currentVolume = 0;
    int maxVolume = 5;
    int minVolume = 0;

    boolean onOrOff(){
        if(isConnected == false){
            isConnected = true;
            System.out.println("The TV is turned on..");
        }else{
            isConnected = false;
            System.out.println("The TV is turned off..");
        }
        return isConnected;
    }

    void increaseVolume(){
        System.out.println("increaseVolume method is invoked");
        if(isConnected == true){
            System.out.println("System is turned on proceed to increase volume");
            if(currentVolume < maxVolume){
                currentVolume += 1;
                System.out.println("Current Volume : " + currentVolume);
            }else{
                System.out.println("Volume reached to max");
            }
        }else System.out.println("Switch on first!");
    }

    void decreaseVolume(){
        System.out.println("decreaseVolume method is invoked");
        if(isConnected == true){
            System.out.println("System is turned on proceed to decrease volume");
            if(currentVolume > minVolume){
                currentVolume -= 1;
                System.out.println("Current Volume : " + currentVolume);
            }else{
                System.out.println("Volume reached to min");
            }
        }else System.out.println("Switch on first!");
    }
}
