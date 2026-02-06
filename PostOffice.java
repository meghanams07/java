class PostOffice {
    public static void main(String[] args) {
        String name = "Majestic Post Office";
        String postMaster = "Lakshmi";
        String area = "Majestic";

        String services[] = {"Speed Post", "Registered Post", "Money Order", "Parcel"};
        String staff[] = {"Ramesh", "Anita", "Karthik"};

        System.out.println("The Post Office Information is:");
        System.out.println("Post Office Name: " + name);
        System.out.println("Post Master: " + postMaster);
        System.out.println("Area: " + area);

        for(String service : services) {
            System.out.println("Service Available: " + service);
        }

        for(String member : staff) {
            System.out.println("Staff Member: " + member);
        }
    }
}
