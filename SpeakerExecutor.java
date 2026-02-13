class SpeakerExecutor{
    public static void main(String[] speaker){

        boolean ref = Speaker.onOrOff();
        System.out.println(ref);

        Speaker.increaseVolume();  
		
		Speaker.decreaseVolume(); 
    }
}