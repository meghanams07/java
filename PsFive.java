class PsFive{

    static String brand;
    static double price;
    static int storageGB;
    static boolean isDigitalEdition;
    static int numberOfControllers;
    static String color;

    public static boolean createPsFive(String brands,double prices,int storage,boolean digitalEdition,int controllers,String colors){

        boolean isPsCreated = false;
        boolean isbrandsValid = false;
        boolean ispricesValid = false;
        boolean isstorageValid = false;
        boolean isdigitalEditionValid = false;
        boolean iscontrollersValid = false;
        boolean iscolorsValid = false;

        if(brands != null && brands.length() >= 2){
            brand = brands;
            isbrandsValid = true;
        }else{
            System.out.println("Brand is not valid");
        }

        if(prices > 20000 && prices < 100000){
            price = prices;
            ispricesValid = true;
        }else{
            System.out.println("Price is not valid");
        }

        if(storage >= 500 && storage <= 2000){
            storageGB = storage;
            isstorageValid = true;
        }else{
            System.out.println("Storage is not valid");
        }

        if(digitalEdition == true || digitalEdition == false){
            isDigitalEdition = digitalEdition;
            isdigitalEditionValid = true;
        }

        if(controllers >= 1 && controllers <= 4){
            numberOfControllers = controllers;
            iscontrollersValid = true;
        }else{
            System.out.println("Controllers count is not valid");
        }

        if(colors != null && colors.length() >= 3){
            color = colors;
            iscolorsValid = true;
        }else{
            System.out.println("Color is not valid");
        }

        if(isbrandsValid && ispricesValid && isstorageValid && isdigitalEditionValid && iscontrollersValid && iscolorsValid){
            isPsCreated = true;
        }

        return isPsCreated;
    };

    public static void getPsDetails(){

        System.out.println("PsFive Details are :");
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Storage (GB) : " + storageGB);
        System.out.println("Digital Edition : " + isDigitalEdition);
        System.out.println("Number Of Controllers : " + numberOfControllers);
        System.out.println("Color : " + color);
    };
}