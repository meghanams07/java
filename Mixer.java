class Mixer{
    boolean isConnected;
    int currentSpeed=0;
    int maxSpeed=5;
    int minSpeed=0;

    boolean onOrOff(){
        if(isConnected==false){
            isConnected=true;
            System.out.println("The mixer is turned on..");
        }else{
            isConnected=false;
            System.out.println("The mixer is turned off..");
        }
        return isConnected;
    }

    void highSpeed(){
        System.out.println("highSpeed method is invoked");
        if(isConnected==true){
            System.out.println("System is turned on proceed to increase speed");
            if(currentSpeed<maxSpeed){
                currentSpeed+=1;
                System.out.println("Current Speed : "+currentSpeed);
            }else{
                System.out.println("Speed reached to max");
            }
        }else System.out.println("Switch on first!");
    }

    void lowSpeed(){
        System.out.println("lowSpeed method is invoked");
        if(isConnected==true){
            System.out.println("System is turned on proceed to decrease speed");
            if(currentSpeed>minSpeed){
                currentSpeed-=1;
                System.out.println("Current Speed : "+currentSpeed);
            }else{
                System.out.println("Speed reached to min");
            }
        }else System.out.println("Switch on first!");
    }
}
