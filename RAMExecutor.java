class RAMExecutor {

    public static void main(String[] args) {

        RAM ram1  = new RAM("Corsair");
        RAM ram2  = new RAM("Corsair","Vengeance");
        RAM ram3  = new RAM("Corsair","Vengeance",16);
        RAM ram4  = new RAM("Corsair","Vengeance",16,"DDR5");
        RAM ram5  = new RAM("Corsair","Vengeance",16,"DDR5",5600);
        RAM ram6  = new RAM("Corsair","Vengeance",16,"DDR5",5600,8500);
        RAM ram7  = new RAM("Corsair","Vengeance",16,"DDR5",5600,8500,36);
        RAM ram8  = new RAM("Corsair","Vengeance",16,"DDR5",5600,8500,36,true);
        RAM ram9  = new RAM("Corsair","Vengeance",16,"DDR5",5600,8500,36,true,"DIMM");
        RAM ram10 = new RAM("Corsair","Vengeance",16,"DDR5",5600,8500,36,true,"DIMM",1.35);
        RAM ram11 = new RAM("Corsair","Vengeance",16,"DDR5",5600,8500,36,true,"DIMM",1.35,true);
        RAM ram12 = new RAM("Corsair","Vengeance",16,"DDR5",5600,8500,36,true,"DIMM",1.35,true,true);

    }
}