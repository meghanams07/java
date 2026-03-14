class Google {

    String companyName;
    String founder;
    int foundedYear;
    String headquarters;
    String ceo;
    int employees;
    double revenue;
    String country;
    String mainProduct;
    String website;
    String emailService;
    String videoPlatform;
    String operatingSystem;
    String browser;
    String parentCompany;
    String aiProject;
    String cloudService;
    int offices;
    double marketValue;
    boolean publicCompany;

    Google(String companyName, String founder, int foundedYear, String headquarters, String ceo,
           int employees, double revenue, String country, String mainProduct, String website,
           String emailService, String videoPlatform, String operatingSystem, String browser,
           String parentCompany, String aiProject, String cloudService, int offices,
           double marketValue, boolean publicCompany) {

        this.companyName = companyName;
        this.founder = founder;
        this.foundedYear = foundedYear;
        this.headquarters = headquarters;
        this.ceo = ceo;
        this.employees = employees;
        this.revenue = revenue;
        this.country = country;
        this.mainProduct = mainProduct;
        this.website = website;
        this.emailService = emailService;
        this.videoPlatform = videoPlatform;
        this.operatingSystem = operatingSystem;
        this.browser = browser;
        this.parentCompany = parentCompany;
        this.aiProject = aiProject;
        this.cloudService = cloudService;
        this.offices = offices;
        this.marketValue = marketValue;
        this.publicCompany = publicCompany;
    }

    
    void display() {

        System.out.println("Company Name : " + this.companyName);
        System.out.println("Founder : " + this.founder);
        System.out.println("Founded Year : " + this.foundedYear);
        System.out.println("Headquarters : " + this.headquarters);
        System.out.println("CEO : " + this.ceo);
        System.out.println("Employees : " + this.employees);
        System.out.println("Revenue : " + this.revenue);
        System.out.println("Country : " + this.country);
        System.out.println("Main Product : " + this.mainProduct);
        System.out.println("Website : " + this.website);
        System.out.println("Email Service : " + this.emailService);
        System.out.println("Video Platform : " + this.videoPlatform);
        System.out.println("Operating System : " + this.operatingSystem);
        System.out.println("Browser : " + this.browser);
        System.out.println("Parent Company : " + this.parentCompany);
        System.out.println("AI Project : " + this.aiProject);
        System.out.println("Cloud Service : " + this.cloudService);
        System.out.println("Offices : " + this.offices);
        System.out.println("Market Value : " + this.marketValue);
        System.out.println("Public Company : " + this.publicCompany);
        System.out.println("-----------------------------------");
    }
}