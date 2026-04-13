class LinkedInRunner {
    public static void main(String[] args) {

        LinkedIn l = new LinkedIn();

        LinkedInProfile p = new LinkedInProfile();
        p.setId(5);
        p.setName("Nilav");
        p.setSkill("Java");

        System.out.println(l.createProfile(p));
        l.getDetails();
    }
}