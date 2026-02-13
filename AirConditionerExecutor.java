class AirConditionerExecutor{
    public static void main(String[] ac){

        boolean ref = AirConditioner.onOrOff();
        System.out.println(ref);

        AirConditioner.increaseTemperature();  

        AirConditioner.decreaseTemperature(); 
    }
}
