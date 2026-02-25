class LgRefrigerator{

    static String brand;
    static String model;
    static double price;
    static int capacityLitres;
    static int starRating;
    static boolean hasFreezer;
    static String color;
    static int warrantyYears;
    static String doorType;
    static boolean hasInverter;

    public static boolean createRefrigerator(String brands,String models,double prices,int capacity,int rating,boolean freezer,String colors,int warranty,String door,
            boolean inverter){

        boolean isRefrigeratorCreated = false;
        boolean isbrandValid = false;
        boolean ismodelValid = false;
        boolean ispriceValid = false;
        boolean iscapacityValid = false;
        boolean isratingValid = false;
        boolean isfreezerValid = false;
        boolean iscolorValid = false;
        boolean iswarrantyValid = false;
        boolean isdoorValid = false;
        boolean isinverterValid = false;

        if(brands != null && brands.length() >= 2){
            brand = brands;
            isbrandValid = true;
        }else{
            System.out.println("Brand is not valid");
        }

        if(models != null && models.length() >= 2){
            model = models;
            ismodelValid = true;
        }else{
            System.out.println("Model is not valid");
        }

        if(prices > 10000 && prices < 300000){
            price = prices;
            ispriceValid = true;
        }else{
            System.out.println("Price is not valid");
        }

        if(capacity >= 100 && capacity <= 1000){
            capacityLitres = capacity;
            iscapacityValid = true;
        }else{
            System.out.println("Capacity is not valid");
        }

        if(rating >= 1 && rating <= 5){
            starRating = rating;
            isratingValid = true;
        }else{
            System.out.println("Star rating is not valid");
        }

        if(freezer == true || freezer == false){
            hasFreezer = freezer;
            isfreezerValid = true;
        }

        if(colors != null && colors.length() >= 3){
            color = colors;
            iscolorValid = true;
        }else{
            System.out.println("Color is not valid");
        }

        if(warranty >= 1 && warranty <= 10){
            warrantyYears = warranty;
            iswarrantyValid = true;
        }else{
            System.out.println("Warranty is not valid");
        }

        if(door != null && door.length() >= 3){
            doorType = door;
            isdoorValid = true;
        }else{
            System.out.println("Door type is not valid");
        }

        if(inverter == true || inverter == false){
            hasInverter = inverter;
            isinverterValid = true;
        }

        if(isbrandValid && ismodelValid && ispriceValid && iscapacityValid && isratingValid && isfreezerValid && iscolorValid && iswarrantyValid && isdoorValid &&
           isinverterValid){

            isRefrigeratorCreated = true;
        }

        return isRefrigeratorCreated;
    };

    public static void getRefrigeratorDetails(){

        System.out.println("LG Refrigerator Details are :");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("Capacity (Litres) : " + capacityLitres);
        System.out.println("Star Rating : " + starRating);
        System.out.println("Has Freezer : " + hasFreezer);
        System.out.println("Color : " + color);
        System.out.println("Warranty Years : " + warrantyYears);
        System.out.println("Door Type : " + doorType);
        System.out.println("Has Inverter : " + hasInverter);
    };
}