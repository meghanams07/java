class Hospital {
    String hospitalName;
    String location;

    Hospital(String hospitalName, String location) {
        System.out.println("Hospital constructor");
        this.hospitalName = hospitalName;
        this.location = location;
    }

    public void showHospitalDetails() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Location: " + location);
    }
}