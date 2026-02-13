class FanExecutor{
    public static void main(String[] fan){

        boolean ref = Fan.onOrOff();
        System.out.println(ref);

        Fan.increaseSpeed();  

        Fan.decreaseSpeed(); 
    }
}
