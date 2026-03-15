class Package {

    int packageId;
    String packageName;
    String destination;
    int days;
    int nights;
    String transport;
    String hotelType;
    String foodType;
    String guide;
    String startDate;
    String endDate;
    String price;
    String currency;
    String category;
    String activities;
    String season;
    String insurance;
    String status;
    String discount;
    String description;

    public void getPackageDetails(){

        System.out.println("PackageId: " + packageId);
        System.out.println("PackageName: " + packageName);
        System.out.println("Destination: " + destination);
        System.out.println("Days: " + days);
        System.out.println("Nights: " + nights);
        System.out.println("Transport: " + transport);
        System.out.println("HotelType: " + hotelType);
        System.out.println("FoodType: " + foodType);
        System.out.println("Guide: " + guide);
        System.out.println("StartDate: " + startDate);
        System.out.println("EndDate: " + endDate);
        System.out.println("Price: " + price);
        System.out.println("Currency: " + currency);
        System.out.println("Category: " + category);
        System.out.println("Activities: " + activities);
        System.out.println("Season: " + season);
        System.out.println("Insurance: " + insurance);
        System.out.println("Status: " + status);
        System.out.println("Discount: " + discount);
        System.out.println("Description: " + description);
    }
}