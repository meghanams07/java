class Company {
    String companyName;
    String location;

    Company(String companyName, String location) {
        System.out.println("Company constructor");
        this.companyName = companyName;
        this.location = location;
    }

    public void showCompanyDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Location: " + location);
    }
}