class LinkedIn {
    int appId;
    String appName;
    String company;
    String founder;
    int launchYear;
    String headquarters;
    int users;
    String platform;
    String category;
    String website;
    String email;
    String contact;
    String security;
    String paymentType;
    String version;
    String colorTheme;
    String support;
    String status;
    String country;
    String language;

    Profile profile;

    public LinkedIn(int appId, String appName, String company, String founder, int launchYear,
                   String headquarters, int users, String platform, String category,
                   String website, String email, String contact, String security,
                   String paymentType, String version, String colorTheme, String support,
                   String status, String country, String language, Profile profile) {
        this.appId = appId;
        this.appName = appName;
        this.company = company;
        this.founder = founder;
        this.launchYear = launchYear;
        this.headquarters = headquarters;
        this.users = users;
        this.platform = platform;
        this.category = category;
        this.website = website;
        this.email = email;
        this.contact = contact;
        this.security = security;
        this.paymentType = paymentType;
        this.version = version;
        this.colorTheme = colorTheme;
        this.support = support;
        this.status = status;
        this.country = country;
        this.language = language;
        this.profile = profile;
    }

    public void getLinkedInDetails() {
        System.out.println("AppId: " + appId);
        System.out.println("AppName: " + appName);
        System.out.println("Company: " + company);
        System.out.println("Founder: " + founder);
        System.out.println("LaunchYear: " + launchYear);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Users: " + users);
        System.out.println("Platform: " + platform);
        System.out.println("Category: " + category);
        System.out.println("Website: " + website);
        System.out.println("Email: " + email);
        System.out.println("Contact: " + contact);
        System.out.println("Security: " + security);
        System.out.println("PaymentType: " + paymentType);
        System.out.println("Version: " + version);
        System.out.println("ColorTheme: " + colorTheme);
        System.out.println("Support: " + support);
        System.out.println("Status: " + status);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
        this.profile.getProfileDetails();
        System.out.println("=================================================");
    }
}