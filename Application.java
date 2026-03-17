class Application {
    int appId;
    String appName;
    String developer;
    String category;
    int downloads;
    double rating;
    int size;
    String version;
    String updateDate;
    String language;
    String platform;
    String permission;
    String license;
    String colorTheme;
    int installCount;
    String supportEmail;
    String website;
    String status;
    String security;
    String features;

    public Application(int appId, String appName, String developer, String category, int downloads,
                      double rating, int size, String version, String updateDate, String language,
                      String platform, String permission, String license, String colorTheme,
                      int installCount, String supportEmail, String website, String status,
                      String security, String features) {
        this.appId = appId;
        this.appName = appName;
        this.developer = developer;
        this.category = category;
        this.downloads = downloads;
        this.rating = rating;
        this.size = size;
        this.version = version;
        this.updateDate = updateDate;
        this.language = language;
        this.platform = platform;
        this.permission = permission;
        this.license = license;
        this.colorTheme = colorTheme;
        this.installCount = installCount;
        this.supportEmail = supportEmail;
        this.website = website;
        this.status = status;
        this.security = security;
        this.features = features;
    }

    public void getApplicationDetails() {
        System.out.println("AppId: " + appId);
        System.out.println("AppName: " + appName);
        System.out.println("Developer: " + developer);
        System.out.println("Category: " + category);
        System.out.println("Downloads: " + downloads);
        System.out.println("Rating: " + rating);
        System.out.println("Size: " + size);
        System.out.println("Version: " + version);
        System.out.println("UpdateDate: " + updateDate);
        System.out.println("Language: " + language);
        System.out.println("Platform: " + platform);
        System.out.println("Permission: " + permission);
        System.out.println("License: " + license);
        System.out.println("ColorTheme: " + colorTheme);
        System.out.println("InstallCount: " + installCount);
        System.out.println("SupportEmail: " + supportEmail);
        System.out.println("Website: " + website);
        System.out.println("Status: " + status);
        System.out.println("Security: " + security);
        System.out.println("Features: " + features);
    }
}