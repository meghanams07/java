class PlayStore {
    int storeId;
    String storeName;
    String company;
    String country;
    int totalApps;
    long downloads;  
    String category;
    String developerConsole;
    String paymentMethod;
    String securityLevel;
    String updatePolicy;
    int launchYear;
    String owner;
    String color;
    String version;
    int rating;
    String supportEmail;
    String website;
    String status;
    String platform;

    Application application;

    public PlayStore(int storeId, String storeName, String company, String country, int totalApps,
                    long downloads, String category, String developerConsole, String paymentMethod,
                    String securityLevel, String updatePolicy, int launchYear, String owner,
                    String color, String version, int rating, String supportEmail, String website,
                    String status, String platform, Application application) {
        this.storeId = storeId;
        this.storeName = storeName;
        this.company = company;
        this.country = country;
        this.totalApps = totalApps;
        this.downloads = downloads;
        this.category = category;
        this.developerConsole = developerConsole;
        this.paymentMethod = paymentMethod;
        this.securityLevel = securityLevel;
        this.updatePolicy = updatePolicy;
        this.launchYear = launchYear;
        this.owner = owner;
        this.color = color;
        this.version = version;
        this.rating = rating;
        this.supportEmail = supportEmail;
        this.website = website;
        this.status = status;
        this.platform = platform;
        this.application = application;
    }

    public void getPlayStoreDetails() {
        System.out.println("StoreId: " + storeId);
        System.out.println("StoreName: " + storeName);
        System.out.println("Company: " + company);
        System.out.println("Country: " + country);
        System.out.println("TotalApps: " + totalApps);
        System.out.println("Downloads: " + downloads);
        System.out.println("Category: " + category);
        System.out.println("DeveloperConsole: " + developerConsole);
        System.out.println("PaymentMethod: " + paymentMethod);
        System.out.println("SecurityLevel: " + securityLevel);
        System.out.println("UpdatePolicy: " + updatePolicy);
        System.out.println("LaunchYear: " + launchYear);
        System.out.println("Owner: " + owner);
        System.out.println("Color: " + color);
        System.out.println("Version: " + version);
        System.out.println("Rating: " + rating);
        System.out.println("SupportEmail: " + supportEmail);
        System.out.println("Website: " + website);
        System.out.println("Status: " + status);
        System.out.println("Platform: " + platform);
        System.out.println("--- Application Details ---");
        this.application.getApplicationDetails();
        System.out.println("=====================================");
    }
}
