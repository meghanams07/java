class WashingMachineExecutor{
    public static void main(String[] machine){

        boolean ref = WashingMachine.onOrOff();
        System.out.println(ref);

        WashingMachine.increaseLoad();  

        WashingMachine.decreaseLoad(); 
    }
}
