class Project {
    int projectId;
    String projectName;
    String domain;
    String technology;
    int teamSize;
    int durationMonths;
    double budget;
    String status;
    String manager;
    String startDate;
    String endDate;
    String priority;
    String category;
    String platform;
    String clientName;
    String location;
    String type;
    String methodology;
    String version;
    String department;

    public void getProjectDetails() {
        System.out.println("ProjectId: " + projectId);
        System.out.println("ProjectName: " + projectName);
        System.out.println("Domain: " + domain);
        System.out.println("Technology: " + technology);
        System.out.println("TeamSize: " + teamSize);
        System.out.println("DurationMonths: " + durationMonths);
        System.out.println("Budget: " + budget);
        System.out.println("Status: " + status);
        System.out.println("Manager: " + manager);
        System.out.println("StartDate: " + startDate);
        System.out.println("EndDate: " + endDate);
        System.out.println("Priority: " + priority);
        System.out.println("Category: " + category);
        System.out.println("Platform: " + platform);
        System.out.println("ClientName: " + clientName);
        System.out.println("Location: " + location);
        System.out.println("Type: " + type);
        System.out.println("Methodology: " + methodology);
        System.out.println("Version: " + version);
        System.out.println("Department: " + department);
    }
}