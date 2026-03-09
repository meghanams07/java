class PenDriveExecutor{
    public static void main(String[] args){

        PenDrive pen=new PenDrive();

        pen.brand="SanDisk";
        pen.storage=64;
        pen.price=750;
        pen.type="USB 3.0";
        pen.weight=15;

        System.out.println("Brand :"+pen.brand);
        System.out.println("Storage :"+pen.storage);
        System.out.println("Price :"+pen.price);
        System.out.println("Type :"+pen.type);
        System.out.println("Weight :"+pen.weight);

        String colors[]={"Black","Red","Silver"};
        System.out.println("Colors :");

        for(String c:colors){
            System.out.println(c);
        }

        String compatibleDevices[]={"Laptop","Desktop","SmartTV"};
        System.out.println("Compatible devices :");

        for(String d:compatibleDevices){
            System.out.println(d);
        }

        String vendors[]={"Amazon","Flipkart","Reliance"};
        System.out.println("Vendors :");

        for(String v:vendors){
            System.out.println(v);
        }
    }
}