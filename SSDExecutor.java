class SSDExecutor {

    public static void main(String[] args) {

        SSD ssd1  = new SSD("Samsung");
        SSD ssd2  = new SSD("Samsung","980 Pro");
        SSD ssd3  = new SSD("Samsung","980 Pro",1000);
        SSD ssd4  = new SSD("Samsung","980 Pro",1000,"NVMe");
        SSD ssd5  = new SSD("Samsung","980 Pro",1000,"NVMe",15000);
        SSD ssd6  = new SSD("Samsung","980 Pro",1000,"NVMe",15000,"PCIe");
        SSD ssd7  = new SSD("Samsung","980 Pro",1000,"NVMe",15000,"PCIe",7000);
        SSD ssd8  = new SSD("Samsung","980 Pro",1000,"NVMe",15000,"PCIe",7000,5000);
        SSD ssd9  = new SSD("Samsung","980 Pro",1000,"NVMe",15000,"PCIe",7000,5000,0.05);
        SSD ssd10 = new SSD("Samsung","980 Pro",1000,"NVMe",15000,"PCIe",7000,5000,0.05,true);
        SSD ssd11 = new SSD("Samsung","980 Pro",1000,"NVMe",15000,"PCIe",7000,5000,0.05,true,false);
        SSD ssd12 = new SSD("Samsung","980 Pro",1000,"NVMe",15000,"PCIe",7000,5000,0.05,true,false,true);

    }
}