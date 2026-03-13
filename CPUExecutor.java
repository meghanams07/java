class CPUExecutor {

    public static void main(String[] args) {

        CPU cpu1  = new CPU("Intel");
        CPU cpu2  = new CPU("Intel","i7-13700K");
        CPU cpu3  = new CPU("Intel","i7-13700K",16);
        CPU cpu4  = new CPU("Intel","i7-13700K",16,24);
        CPU cpu5  = new CPU("Intel","i7-13700K",16,24,3.4);
        CPU cpu6  = new CPU("Intel","i7-13700K",16,24,3.4,5.4);
        CPU cpu7  = new CPU("Intel","i7-13700K",16,24,3.4,5.4,30);
        CPU cpu8  = new CPU("Intel","i7-13700K",16,24,3.4,5.4,30,42000);
        CPU cpu9  = new CPU("Intel","i7-13700K",16,24,3.4,5.4,30,42000,"LGA1700");
        CPU cpu10 = new CPU("Intel","i7-13700K",16,24,3.4,5.4,30,42000,"LGA1700",0.2);
        CPU cpu11 = new CPU("Intel","i7-13700K",16,24,3.4,5.4,30,42000,"LGA1700",0.2,true);
        CPU cpu12 = new CPU("Intel","i7-13700K",16,24,3.4,5.4,30,42000,"LGA1700",0.2,true,true);

    }
}