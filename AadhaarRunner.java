class AadhaarRunner {
    public static void main(String[] args) {
        AadhaarService s = new AadhaarService();

        Aadhaar a = new Aadhaar();
        a.setId(999);
        a.setName("Meghana");
        a.setAddress("India");

        System.out.println(s.createAadhaar(a));
        s.getDetails();
    }
}
