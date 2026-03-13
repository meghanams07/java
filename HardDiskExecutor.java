class HardDiskExecutor {

    public static void main(String[] args) {

        HardDisk hd1  = new HardDisk("Seagate");
        HardDisk hd2  = new HardDisk("Seagate","Barracuda");
        HardDisk hd3  = new HardDisk("Seagate","Barracuda",2000);
        HardDisk hd4  = new HardDisk("Seagate","Barracuda",2000,"HDD");
        HardDisk hd5  = new HardDisk("Seagate","Barracuda",2000,"HDD",7500);
        HardDisk hd6  = new HardDisk("Seagate","Barracuda",2000,"HDD",7500,"SATA");
        HardDisk hd7  = new HardDisk("Seagate","Barracuda",2000,"HDD",7500,"SATA",7200);
        HardDisk hd8  = new HardDisk("Seagate","Barracuda",2000,"HDD",7500,"SATA",7200,256);
        HardDisk hd9  = new HardDisk("Seagate","Barracuda",2000,"HDD",7500,"SATA",7200,256,0.45);
        HardDisk hd10 = new HardDisk("Seagate","Barracuda",2000,"HDD",7500,"SATA",7200,256,0.45,true);
        HardDisk hd11 = new HardDisk("Seagate","Barracuda",2000,"HDD",7500,"SATA",7200,256,0.45,true,true);
        HardDisk hd12 = new HardDisk("Seagate","Barracuda",2000,"HDD",7500,"SATA",7200,256,0.45,true,true,true);

    }
}