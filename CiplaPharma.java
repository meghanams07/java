class CiplaPharma{

    static String medicineName;
    static String manufacturer;
    static double price;
    static int quantityTablets;
    static String expiryDate;
    static String dosage;
    static boolean prescriptionRequired;
    static String medicineType;
    static double rating;
    static int stock;

    public static boolean createMedicine(String name,String manufacturers,double prices,int quantity,String expiry,String dosages,
            boolean prescription,String type,double ratings,int stocks){

        boolean isMedicineCreated = false;
        boolean isnameValid = false;
        boolean ismanufacturerValid = false;
        boolean ispriceValid = false;
        boolean isquantityValid = false;
        boolean isexpiryValid = false;
        boolean isdosageValid = false;
        boolean isprescriptionValid = false;
        boolean istypeValid = false;
        boolean isratingValid = false;
        boolean isstockValid = false;

        if(name != null && name.length() >= 3){
            medicineName = name;
            isnameValid = true;
        }else{
            System.out.println("Medicine name is not valid");
        }

        if(manufacturers != null && manufacturers.length() >= 3){
            manufacturer = manufacturers;
            ismanufacturerValid = true;
        }else{
            System.out.println("Manufacturer is not valid");
        }

        if(prices > 1 && prices < 100000){
            price = prices;
            ispriceValid = true;
        }else{
            System.out.println("Price is not valid");
        }

        if(quantity > 0 && quantity <= 1000){
            quantityTablets = quantity;
            isquantityValid = true;
        }else{
            System.out.println("Quantity is not valid");
        }

        if(expiry != null && expiry.length() >= 5){
            expiryDate = expiry;
            isexpiryValid = true;
        }else{
            System.out.println("Expiry date is not valid");
        }

        if(dosages != null && dosages.length() >= 2){
            dosage = dosages;
            isdosageValid = true;
        }else{
            System.out.println("Dosage is not valid");
        }

        if(prescription == true || prescription == false){
            prescriptionRequired = prescription;
            isprescriptionValid = true;
        }

        if(type != null && type.length() >= 3){
            medicineType = type;
            istypeValid = true;
        }else{
            System.out.println("Medicine type is not valid");
        }

        if(ratings >= 1.0 && ratings <= 5.0){
            rating = ratings;
            isratingValid = true;
        }else{
            System.out.println("Rating is not valid");
        }

        if(stocks >= 0 && stocks <= 100000){
            stock = stocks;
            isstockValid = true;
        }else{
            System.out.println("Stock is not valid");
        }

        if(isnameValid && ismanufacturerValid && ispriceValid && isquantityValid && isexpiryValid && isdosageValid && isprescriptionValid && istypeValid &&
           isratingValid && isstockValid){

            isMedicineCreated = true;
        }

        return isMedicineCreated;
    };

    public static void getMedicineDetails(){

        System.out.println("Medicine Details are :");
        System.out.println("Medicine Name : " + medicineName);
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("Price : " + price);
        System.out.println("Quantity : " + quantityTablets);
        System.out.println("Expiry Date : " + expiryDate);
        System.out.println("Dosage : " + dosage);
        System.out.println("Prescription Required : " + prescriptionRequired);
        System.out.println("Medicine Type : " + medicineType);
        System.out.println("Rating : " + rating);
        System.out.println("Stock : " + stock);
    };
}