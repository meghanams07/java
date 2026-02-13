class IronBoxExecutor{
    public static void main(String[] ironBox){

        boolean ref = IronBox.onOrOff();
        System.out.println(ref);

        IronBox.increaseHeat();  

        IronBox.decreaseHeat(); 
    }
}
