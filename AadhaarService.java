class AadhaarService {
    Aadhaar a;

    public boolean createAadhaar(Aadhaar a) {
        if (a.getId() > 0 &&
            a.getName() != null && !a.getName().isEmpty() &&
            a.getAddress() != null && !a.getAddress().isEmpty()) {

            this.a = a;
            return true;
        }
        return false;
    }

    public void getDetails() {
        if (a != null) {
            System.out.println(a.getId());
            System.out.println(a.getName());
            System.out.println(a.getAddress());
        }
    }
}
