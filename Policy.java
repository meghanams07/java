class Policy {

    int policyId;
    String policyName;
    String department;
    String category;
    String launchDate;
    String targetGroup;
    String objective;
    String benefits;
    String eligibility;
    String coverage;
    String implementationType;
    String budget;
    String duration;
    String status;
    String website;
    String contact;
    String language;
    String approvalAuthority;
    String impact;
    String description;

    public void getPolicyDetails(){

        System.out.println("PolicyId: " + policyId);
        System.out.println("PolicyName: " + policyName);
        System.out.println("Department: " + department);
        System.out.println("Category: " + category);
        System.out.println("LaunchDate: " + launchDate);
        System.out.println("TargetGroup: " + targetGroup);
        System.out.println("Objective: " + objective);
        System.out.println("Benefits: " + benefits);
        System.out.println("Eligibility: " + eligibility);
        System.out.println("Coverage: " + coverage);
        System.out.println("ImplementationType: " + implementationType);
        System.out.println("Budget: " + budget);
        System.out.println("Duration: " + duration);
        System.out.println("Status: " + status);
        System.out.println("Website: " + website);
        System.out.println("Contact: " + contact);
        System.out.println("Language: " + language);
        System.out.println("ApprovalAuthority: " + approvalAuthority);
        System.out.println("Impact: " + impact);
        System.out.println("Description: " + description);
    }
}