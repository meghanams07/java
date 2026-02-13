class LightExecutor{
    public static void main(String[] light){

        boolean ref = Light.onOrOff();
        System.out.println(ref);

        Light.increaseBrightness();  

        Light.decreaseBrightness(); 
    }
}
