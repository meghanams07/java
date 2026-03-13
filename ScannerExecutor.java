class ScannerExecutor {

    public static void main(String[] args) {

        ScannerDevice sc1  = new ScannerDevice("Canon");
        ScannerDevice sc2  = new ScannerDevice("Canon","ScanPro");
        ScannerDevice sc3  = new ScannerDevice("Canon","ScanPro","Flatbed");
        ScannerDevice sc4  = new ScannerDevice("Canon","ScanPro","Flatbed","1200dpi");
        ScannerDevice sc5  = new ScannerDevice("Canon","ScanPro","Flatbed","1200dpi",9500);
        ScannerDevice sc6  = new ScannerDevice("Canon","ScanPro","Flatbed","1200dpi",9500,true);
        ScannerDevice sc7  = new ScannerDevice("Canon","ScanPro","Flatbed","1200dpi",9500,true,true);
        ScannerDevice sc8  = new ScannerDevice("Canon","ScanPro","Flatbed","1200dpi",9500,true,true,30);
        ScannerDevice sc9  = new ScannerDevice("Canon","ScanPro","Flatbed","1200dpi",9500,true,true,30,3.2);
        ScannerDevice sc10 = new ScannerDevice("Canon","ScanPro","Flatbed","1200dpi",9500,true,true,30,3.2,true);
        ScannerDevice sc11 = new ScannerDevice("Canon","ScanPro","Flatbed","1200dpi",9500,true,true,30,3.2,true,true);
        ScannerDevice sc12 = new ScannerDevice("Canon","ScanPro","Flatbed","1200dpi",9500,true,true,30,3.2,true,true,true);

    }
}