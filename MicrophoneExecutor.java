class MicrophoneExecutor {

    public static void main(String[] args) {

        Microphone mc1  = new Microphone("Sony");
        Microphone mc2  = new Microphone("Sony","XM100");
        Microphone mc3  = new Microphone("Sony","XM100","Condenser");
        Microphone mc4  = new Microphone("Sony","XM100","Condenser","Black");
        Microphone mc5  = new Microphone("Sony","XM100","Condenser","Black",6500);
        Microphone mc6  = new Microphone("Sony","XM100","Condenser","Black",6500,true);
        Microphone mc7  = new Microphone("Sony","XM100","Condenser","Black",6500,true,"Bluetooth");
        Microphone mc8  = new Microphone("Sony","XM100","Condenser","Black",6500,true,"Bluetooth",20000);
        Microphone mc9  = new Microphone("Sony","XM100","Condenser","Black",6500,true,"Bluetooth",20000,0.5);
        Microphone mc10 = new Microphone("Sony","XM100","Condenser","Black",6500,true,"Bluetooth",20000,0.5,true);
        Microphone mc11 = new Microphone("Sony","XM100","Condenser","Black",6500,true,"Bluetooth",20000,0.5,true,true);
        Microphone mc12 = new Microphone("Sony","XM100","Condenser","Black",6500,true,"Bluetooth",20000,0.5,true,true,true);

    }
}