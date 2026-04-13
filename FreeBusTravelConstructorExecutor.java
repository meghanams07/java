class FreeBusTravelConstructorExecutor {
    public static void main(String[] args) {

        Aadhaar ad = new Aadhaar();
        ad.aadhaarNumber = 111122223333L;
        ad.name = "Anita";
        ad.age = 22;
        ad.gender = "Female";
        ad.address = "Tumkur";
        ad.mobileNumber = "9000000000";
        ad.dob = "15-08-2002";
        ad.isVerified = true;

        FreeBusTravel bus = new FreeBusTravel(ad);
        bus.getDetails();
    }
}