class AdapterExecutor {

    public static void main(String[] args) {

        Adapter a1  = new Adapter("Belkin");
        Adapter a2  = new Adapter("Belkin","Travel Pro");
        Adapter a3  = new Adapter("Belkin","Travel Pro",65);
        Adapter a4  = new Adapter("Belkin","Travel Pro",65,"Wall");
        Adapter a5  = new Adapter("Belkin","Travel Pro",65,"Wall",2500);
        Adapter a6  = new Adapter("Belkin","Travel Pro",65,"Wall",2500,2);
        Adapter a7  = new Adapter("Belkin","Travel Pro",65,"Wall",2500,2,true);
        Adapter a8  = new Adapter("Belkin","Travel Pro",65,"Wall",2500,2,true,true);
        Adapter a9  = new Adapter("Belkin","Travel Pro",65,"Wall",2500,2,true,true,"USB-C");
        Adapter a10 = new Adapter("Belkin","Travel Pro",65,"Wall",2500,2,true,true,"USB-C",0.18);
        Adapter a11 = new Adapter("Belkin","Travel Pro",65,"Wall",2500,2,true,true,"USB-C",0.18,true);
        Adapter a12 = new Adapter("Belkin","Travel Pro",65,"Wall",2500,2,true,true,"USB-C",0.18,true,true);

    }
}