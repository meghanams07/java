class Package {

    int packageId, days, nights;
    String packageName, destination, transport, hotelType, foodType, guide;
    String startDate, endDate, price, currency, category, activities, season;
    String insurance, status, discount, description;

    public Package(int packageId, String packageName, String destination, int days, int nights,
                   String transport, String hotelType, String foodType, String guide,
                   String startDate, String endDate, String price, String currency,
                   String category, String activities, String season, String insurance,
                   String status, String discount, String description) {
        this.packageId = packageId;
        this.packageName = packageName;
        this.destination = destination;
        this.days = days;
        this.nights = nights;
        this.transport = transport;
        this.hotelType = hotelType;
        this.foodType = foodType;
        this.guide = guide;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.currency = currency;
        this.category = category;
        this.activities = activities;
        this.season = season;
        this.insurance = insurance;
        this.status = status;
        this.discount = discount;
        this.description = description;
    }

    public void displayDetails() {
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
        System.out.println("Price: " + price + " " + currency);
        System.out.println("Category: " + category);
        System.out.println("Activities: " + activities);
        System.out.println("Season: " + season);
        System.out.println("Insurance: " + insurance);
        System.out.println("Status: " + status);
        System.out.println("Discount: " + discount);
        System.out.println("Description: " + description);
        System.out.println("---");
    }
}