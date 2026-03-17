class Profile {
    int profileId;
    String userName;
    String headline;
    String company;
    String jobTitle;
    int experienceYears;
    String location;
    String education;
    String skills;
    String email;
    String phone;
    String website;
    int connections;
    String industry;
    String language;
    String certification;
    String projects;
    String status;
    String profileType;
    String description;

    public Profile(int profileId, String userName, String headline, String company,
                  String jobTitle, int experienceYears, String location, String education,
                  String skills, String email, String phone, String website, int connections,
                  String industry, String language, String certification, String projects,
                  String status, String profileType, String description) {
        this.profileId = profileId;
        this.userName = userName;
        this.headline = headline;
        this.company = company;
        this.jobTitle = jobTitle;
        this.experienceYears = experienceYears;
        this.location = location;
        this.education = education;
        this.skills = skills;
        this.email = email;
        this.phone = phone;
        this.website = website;
        this.connections = connections;
        this.industry = industry;
        this.language = language;
        this.certification = certification;
        this.projects = projects;
        this.status = status;
        this.profileType = profileType;
        this.description = description;
    }

    public void getProfileDetails() {
        System.out.println("ProfileId: " + profileId);
        System.out.println("UserName: " + userName);
        System.out.println("Headline: " + headline);
        System.out.println("Company: " + company);
        System.out.println("JobTitle: " + jobTitle);
        System.out.println("ExperienceYears: " + experienceYears);
        System.out.println("Location: " + location);
        System.out.println("Education: " + education);
        System.out.println("Skills: " + skills);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Website: " + website);
        System.out.println("Connections: " + connections);
        System.out.println("Industry: " + industry);
        System.out.println("Language: " + language);
        System.out.println("Certification: " + certification);
        System.out.println("Projects: " + projects);
        System.out.println("Status: " + status);
        System.out.println("ProfileType: " + profileType);
        System.out.println("Description: " + description);
    }
}
