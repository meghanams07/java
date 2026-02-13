class MixerExecutor{
    public static void main(String[] mixer){

        boolean ref = Mixer.onOrOff();
        System.out.println(ref);

        Mixer.highSpeed();  

        Mixer.lowSpeed(); 
    }
}
