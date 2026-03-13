class MotherboardExecutor {

    public static void main(String[] args) {

        Motherboard mb1  = new Motherboard("ASUS");
        Motherboard mb2  = new Motherboard("ASUS","ROG Strix");
        Motherboard mb3  = new Motherboard("ASUS","ROG Strix","Z790");
        Motherboard mb4  = new Motherboard("ASUS","ROG Strix","Z790","LGA1700");
        Motherboard mb5  = new Motherboard("ASUS","ROG Strix","Z790","LGA1700",4);
        Motherboard mb6  = new Motherboard("ASUS","ROG Strix","Z790","LGA1700",4,128);
        Motherboard mb7  = new Motherboard("ASUS","ROG Strix","Z790","LGA1700",4,128,32000);
        Motherboard mb8  = new Motherboard("ASUS","ROG Strix","Z790","LGA1700",4,128,32000,"ATX");
        Motherboard mb9  = new Motherboard("ASUS","ROG Strix","Z790","LGA1700",4,128,32000,"ATX",true);
        Motherboard mb10 = new Motherboard("ASUS","ROG Strix","Z790","LGA1700",4,128,32000,"ATX",true,true);
        Motherboard mb11 = new Motherboard("ASUS","ROG Strix","Z790","LGA1700",4,128,32000,"ATX",true,true,1.5);
        Motherboard mb12 = new Motherboard("ASUS","ROG Strix","Z790","LGA1700",4,128,32000,"ATX",true,true,1.5,true);

    }
}