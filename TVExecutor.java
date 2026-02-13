class TVExecutor{
    public static void main(String[] tv){

        boolean ref = TV.onOrOff();
        System.out.println(ref);

        TV.nextChannel();  

        TV.prevChannel(); 
    }
}
