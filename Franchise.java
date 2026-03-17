class Franchise {
    int franchiseId;
    String franchiseName;
    String owner;
    String city;
    String country;
    int foundedYear;
    int championships;
    int wins;
    int losses;
    String homeTrack;
    int capacity;
    String color;
    String sponsor;
    int budget;
    int employees;
    String manager;
    String category;
    String status;
    int ranking;
    String headquarters;

    public Franchise(int franchiseId, String franchiseName, String owner, String city, 
                    String country, int foundedYear, int championships, int wins, 
                    int losses, String homeTrack, int capacity, String color, 
                    String sponsor, int budget, int employees, String manager, 
                    String category, String status, int ranking, String headquarters) {
        this.franchiseId = franchiseId;
        this.franchiseName = franchiseName;
        this.owner = owner;
        this.city = city;
        this.country = country;
        this.foundedYear = foundedYear;
        this.championships = championships;
        this.wins = wins;
        this.losses = losses;
        this.homeTrack = homeTrack;
        this.capacity = capacity;
        this.color = color;
        this.sponsor = sponsor;
        this.budget = budget;
        this.employees = employees;
        this.manager = manager;
        this.category = category;
        this.status = status;
        this.ranking = ranking;
        this.headquarters = headquarters;
    }

    public void displayDetails() {
        System.out.println("FranchiseId: " + franchiseId);
        System.out.println("FranchiseName: " + franchiseName);
        System.out.println("Owner: " + owner);
        System.out.println("City: " + city);
        System.out.println("Country: " + country);
        System.out.println("FoundedYear: " + foundedYear);
        System.out.println("Championships: " + championships);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("HomeTrack: " + homeTrack);
        System.out.println("Capacity: " + capacity);
        System.out.println("Color: " + color);
        System.out.println("Sponsor: " + sponsor);
        System.out.println("Budget: " + budget);
        System.out.println("Employees: " + employees);
        System.out.println("Manager: " + manager);
        System.out.println("Category: " + category);
        System.out.println("Status: " + status);
        System.out.println("Ranking: " + ranking);
        System.out.println("Headquarters: " + headquarters);
    }
}