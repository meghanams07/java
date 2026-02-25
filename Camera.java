class Camera{

    static String brand;
    static String model;
    static double price;
    static int megapixels;
    static int batteryCapacity;
    static boolean isWiFiEnabled;
    static boolean isBluetoothEnabled;
    static double weight;
    static String color;
    static int warrantyYears;

    public static boolean createCamera(String brands,String models,double prices,int megapixel,int batteryCapacities,boolean isWiFiEnable,
		boolean isBluetoothEnable,double wt,String colors,int warrantyYear){
        
		boolean isCameraAccountCreated = false;
        boolean isbrandsValid = false;
        boolean ismodelsValid = false;
        boolean ispricesValid = false;
        boolean ismegapixelValid = false;
        boolean isbatteryCapacitiesValid = false;
        boolean isisWiFiEnableValid = false;
        boolean isisBluetoothEnableValid = false;
        boolean iswtValid = false;
        boolean iscolorsValid = false;
        boolean iswarrantyYearValid = false;

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

        if(prices > 1000 && prices < 500000){
            price = prices;
            ispricesValid = true;
        }else{
            System.out.println("Price is not valid");
        }

        if(megapixel >= 5 && megapixel <= 200){
            megapixels = megapixel;
            ismegapixelValid = true;
        }else{
            System.out.println("Megapixels is not valid");
        }

        if(batteryCapacities >= 500 && batteryCapacities <= 10000){
            batteryCapacity = batteryCapacities;
            isbatteryCapacitiesValid = true;
        }else{
            System.out.println("Battery Capacity is not valid");
        }

        if(isWiFiEnable == true || isWiFiEnable == false){
            isWiFiEnabled = isWiFiEnable;
            isisWiFiEnableValid = true;
        }

        if(isBluetoothEnable == true || isBluetoothEnable == false){
            isBluetoothEnabled = isBluetoothEnable;
            isisBluetoothEnableValid = true;
        }

        if(wt >= 100 && wt <= 5000){
            weight = wt;
            iswtValid = true;
        }else{
            System.out.println("Weight is not valid");
        }

        if(colors != null && colors.length() >= 3){
            color = colors;
            iscolorsValid = true;
        }else{
            System.out.println("Color is not valid");
        }


        if(warrantyYear >= 1 && warrantyYear <= 5){
            warrantyYears = warrantyYear;
            iswarrantyYearValid = true;
        }else{
            System.out.println("Warranty year is not valid");
        }


        if(isbrandsValid && ismodelsValid && ispricesValid && ismegapixelValid && isbatteryCapacitiesValid && isisWiFiEnableValid && 
		    isisBluetoothEnableValid &&iswtValid && iscolorsValid && iswarrantyYearValid){
                isCameraAccountCreated = true;
        }

        return isCameraAccountCreated;
    };
	
	public static void getCameraDetails(){

    System.out.println("Camera Details are :");
    System.out.println("Brand : " + brand);
    System.out.println("Model : " + model);
    System.out.println("Price : " + price);
    System.out.println("Megapixels : " + megapixels);
    System.out.println("Battery Capacity : " + batteryCapacity);
    System.out.println("WiFi Enabled : " + isWiFiEnabled);
    System.out.println("Bluetooth Enabled : " + isBluetoothEnabled);
    System.out.println("Weight : " + weight);
    System.out.println("Color : " + color);
    System.out.println("Warranty Years : " + warrantyYears);
	};
}