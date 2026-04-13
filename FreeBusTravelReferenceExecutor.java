class FreeBusTravelReferenceExecutor {
    public static void main(String[] args) {

        Aadhaar ad = new Aadhaar();
        ad.aadhaarNumber = 987654321098L;
        ad.name = "Meena";
        ad.age = 35;
        ad.gender = "Female";
        ad.address = "Mysore";
        ad.mobileNumber = "9123456780";
        ad.dob = "10-05-1990";
        ad.isVerified = true;

        FreeBusTravel bus = new FreeBusTravel();
        bus.aadhaar = ad;
        bus.getDetails();
    }
}