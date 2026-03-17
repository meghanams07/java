class FoodStreet {

    int streetId, stalls;
    String streetName, specialty, famousDish, cuisineType, hygiene, lighting;
    String seating, parking, timing, bestSeason, crowdLevel, streetLength;
    String foodType, priceRange, paymentMode, guide, status, popularity;

    public FoodStreet(int streetId, String streetName, String specialty, int stalls, 
                     String famousDish, String cuisineType, String hygiene, String lighting,
                     String seating, String parking, String timing, String bestSeason,
                     String crowdLevel, String streetLength, String foodType, String priceRange,
                     String paymentMode, String guide, String status, String popularity) {
        this.streetId = streetId;
        this.streetName = streetName;
        this.specialty = specialty;
        this.stalls = stalls;
        this.famousDish = famousDish;
        this.cuisineType = cuisineType;
        this.hygiene = hygiene;
        this.lighting = lighting;
        this.seating = seating;
        this.parking = parking;
        this.timing = timing;
        this.bestSeason = bestSeason;
        this.crowdLevel = crowdLevel;
        this.streetLength = streetLength;
        this.foodType = foodType;
        this.priceRange = priceRange;
        this.paymentMode = paymentMode;
        this.guide = guide;
        this.status = status;
        this.popularity = popularity;
    }

    public void displayDetails() {
        System.out.println(" StreetId: " + streetId);
        System.out.println(" StreetName: " + streetName);
        System.out.println(" Specialty: " + specialty);
        System.out.println("Stalls: " + stalls);
        System.out.println("FamousDish: " + famousDish);
        System.out.println("CuisineType: " + cuisineType);
        System.out.println("Hygiene: " + hygiene);
        System.out.println("Lighting: " + lighting);
        System.out.println("Seating: " + seating);
        System.out.println("Parking: " + parking);
        System.out.println("Timing: " + timing);
        System.out.println("BestSeason: " + bestSeason);
        System.out.println("CrowdLevel: " + crowdLevel);
        System.out.println("StreetLength: " + streetLength);
        System.out.println("FoodType: " + foodType);
        System.out.println("PriceRange: " + priceRange);
        System.out.println("PaymentMode: " + paymentMode);
        System.out.println("Guide: " + guide);
        System.out.println("Status: " + status);
        System.out.println("Popularity: " + popularity);
        System.out.println("═══════════════════════");
    }
}