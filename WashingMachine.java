class WashingMachine{

    static String brand;
    static String model;
    static double price;
    static int capacityKg;
    static String type;
    static int warrantyYears;
    static boolean isFullyAutomatic;
    static int spinSpeedRPM;
    static String color;
    static int starRating;

    public static boolean createWashingMachine(String brands,String models,double prices,int capacity,String types,int warranty,boolean fullyAutomatic,
            int spinSpeed,String colors,int rating){

        boolean isWashingMachineCreated = false;
        boolean isbrandsValid = false;
        boolean ismodelsValid = false;
        boolean ispricesValid = false;
        boolean iscapacityValid = false;
        boolean istypesValid = false;
        boolean iswarrantyValid = false;
        boolean isfullyAutomaticValid = false;
        boolean isspinSpeedValid = false;
        boolean iscolorsValid = false;
        boolean isratingValid = false;

        if(brands != null && brands.length() >= 2){
            brand = brands;
            isbrandsValid = true;
        }else{
            System.out.println("Brand is not valid");
        }

        if(models != null && models.length() >= 2){
            model = models;
            ismodelsValid = true;
        }else{
            System.out.println("Model is not valid");
        }

        if(prices > 5000 && prices < 200000){
            price = prices;
            ispricesValid = true;
        }else{
            System.out.println("Price is not valid");
        }

        if(capacity >= 5 && capacity <= 15){
            capacityKg = capacity;
            iscapacityValid = true;
        }else{
            System.out.println("Capacity is not valid");
        }

        if(types != null && types.length() >= 3){
            type = types;
            istypesValid = true;
        }else{
            System.out.println("Type is not valid");
        }

        if(warranty >= 1 && warranty <= 10){
            warrantyYears = warranty;
            iswarrantyValid = true;
        }else{
            System.out.println("Warranty is not valid");
        }

        if(fullyAutomatic == true || fullyAutomatic == false){
            isFullyAutomatic = fullyAutomatic;
            isfullyAutomaticValid = true;
        }

        if(spinSpeed >= 600 && spinSpeed <= 2000){
            spinSpeedRPM = spinSpeed;
            isspinSpeedValid = true;
        }else{
            System.out.println("Spin speed is not valid");
        }

        if(colors != null && colors.length() >= 3){
            color = colors;
            iscolorsValid = true;
        }else{
            System.out.println("Color is not valid");
        }

        if(rating >= 1 && rating <= 5){
            starRating = rating;
            isratingValid = true;
        }else{
            System.out.println("Star rating is not valid");
        }

        if(isbrandsValid && ismodelsValid && ispricesValid && iscapacityValid &&istypesValid && iswarrantyValid && isfullyAutomaticValid &&
           isspinSpeedValid && iscolorsValid && isratingValid){

            isWashingMachineCreated = true;
        }

        return isWashingMachineCreated;
    };

    public static void getWashingMachineDetails(){

        System.out.println("Washing Machine Details are :");
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("Capacity (Kg) : " + capacityKg);
        System.out.println("Type : " + type);
        System.out.println("Warranty (Years) : " + warrantyYears);
        System.out.println("Fully Automatic : " + isFullyAutomatic);
        System.out.println("Spin Speed (RPM) : " + spinSpeedRPM);
        System.out.println("Color : " + color);
        System.out.println("Star Rating : " + starRating);
    };
}