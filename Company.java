
class Company {
    int companyId;
    String companyName;
    String hqLocation;
    String ceo;
    int foundedYear;
    int totalEmployees;
    double revenue;
    String industry;
    String website;
    String stockSymbol;
    String status;
    String type;
    String headquarters;
    String country;
    String sector;
    String motto;
    String vision;
    String rating;
    String certification;
    String scale;

    Project project;

    public Company(int companyId, String companyName, String hqLocation, String ceo,
                  int foundedYear, int totalEmployees, double revenue, String industry,
                  String website, String stockSymbol, String status, String type,
                  String headquarters, String country, String sector, String motto,
                  String vision, String rating, String certification, String scale,
                  Project project) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.hqLocation = hqLocation;
        this.ceo = ceo;
        this.foundedYear = foundedYear;
        this.totalEmployees = totalEmployees;
        this.revenue = revenue;
        this.industry = industry;
        this.website = website;
        this.stockSymbol = stockSymbol;
        this.status = status;
        this.type = type;
        this.headquarters = headquarters;
        this.country = country;
        this.sector = sector;
        this.motto = motto;
        this.vision = vision;
        this.rating = rating;
        this.certification = certification;
        this.scale = scale;
        this.project = project;
    }

    public void getCompanyDetails() {
        System.out.println("CompanyId: " + companyId);
        System.out.println("CompanyName: " + companyName);
        System.out.println("HqLocation: " + hqLocation);
        System.out.println("CEO: " + ceo);
        System.out.println("FoundedYear: " + foundedYear);
        System.out.println("TotalEmployees: " + totalEmployees);
        System.out.println("Revenue: " + revenue);
        System.out.println("Industry: " + industry);
        System.out.println("Website: " + website);
        System.out.println("StockSymbol: " + stockSymbol);
        System.out.println("Status: " + status);
        System.out.println("Type: " + type);
        System.out.println("Headquarters: " + headquarters);
        System.out.println("Country: " + country);
        System.out.println("Sector: " + sector);
        System.out.println("Motto: " + motto);
        System.out.println("Vision: " + vision);
        System.out.println("Rating: " + rating);
        System.out.println("Certification: " + certification);
        System.out.println("Scale: " + scale);
        System.out.println("--- Project Details ---");
        this.project.getProjectDetails();
        System.out.println("=====================================");
    }
}
