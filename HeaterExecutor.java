class HeaterExecutor{
    public static void main(String[] heater){

        boolean ref = Heater.onOrOff();
        System.out.println(ref);

        Heater.increaseHeat();  

        Heater.decreaseHeat(); 
    }
}
