class FreeBusTravelMethodExecutor {
    public static void main(String[] args) {

        Aadhaar ad = new Aadhaar();
        ad.aadhaarNumber = 123456789012L;
        ad.name = "Lakshmi";
        ad.age = 28;
        ad.gender = "Female";
        ad.address = "Bangalore";
        ad.mobileNumber = "9876543210";
        ad.dob = "01-01-1998";
        ad.isVerified = true;

        FreeBusTravel bus = new FreeBusTravel();
        bus.addAadhaar(ad);
        bus.getDetails();
    }
}