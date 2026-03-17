class Groww {
    int appId;
    String appName;
    String company;
    String founder;
    String headquarters;
    int launchYear;
    int users;
    String platform;
    String category;
    String website;
    String email;
    String contact;
    String license;
    String security;
    String paymentMethod;
    String version;
    String colorTheme;
    String support;
    String status;
    String country;

    Stock stock;

    public Groww(int appId, String appName, String company, String founder,
                 String headquarters, int launchYear, int users, String platform,
                 String category, String website, String email, String contact,
                 String license, String security, String paymentMethod,
                 String version, String colorTheme, String support,
                 String status, String country, Stock stock) {
        this.appId = appId;
        this.appName = appName;
        this.company = company;
        this.founder = founder;
        this.headquarters = headquarters;
        this.launchYear = launchYear;
        this.users = users;
        this.platform = platform;
        this.category = category;
        this.website = website;
        this.email = email;
        this.contact = contact;
        this.license = license;
        this.security = security;
        this.paymentMethod = paymentMethod;
        this.version = version;
        this.colorTheme = colorTheme;
        this.support = support;
        this.status = status;
        this.country = country;
        this.stock = stock;
    }

    public void getGrowwDetails() {
        System.out.println("AppId: " + appId);
        System.out.println("AppName: " + appName);
        System.out.println("Company: " + company);
        System.out.println("Founder: " + founder);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("LaunchYear: " + launchYear);
        System.out.println("Users: " + users);
        System.out.println("Platform: " + platform);
        System.out.println("Category: " + category);
        System.out.println("Website: " + website);
        System.out.println("Email: " + email);
        System.out.println("Contact: " + contact);
        System.out.println("License: " + license);
        System.out.println("Security: " + security);
        System.out.println("PaymentMethod: " + paymentMethod);
        System.out.println("Version: " + version);
        System.out.println("ColorTheme: " + colorTheme);
        System.out.println("Support: " + support);
        System.out.println("Status: " + status);
        System.out.println("Country: " + country);
        System.out.println();
        this.stock.getStockDetails();
        System.out.println("============================================");
    }
}