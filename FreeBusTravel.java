class FreeBusTravel {

    Aadhaar aadhaar;

    public boolean addAadhaar(Aadhaar aadhaar) {
        this.aadhaar = aadhaar;
        return true;
    }

    public FreeBusTravel(Aadhaar aadhaar) {
        this.aadhaar = aadhaar;
    }

    public FreeBusTravel() {
    }

    public void getDetails() {
        System.out.println(this.aadhaar.aadhaarNumber);
        System.out.println(this.aadhaar.name);
        System.out.println(this.aadhaar.age);
        System.out.println(this.aadhaar.gender);
        System.out.println(this.aadhaar.address);
        System.out.println(this.aadhaar.mobileNumber);
        System.out.println(this.aadhaar.dob);
        System.out.println(this.aadhaar.isVerified);
    }
}