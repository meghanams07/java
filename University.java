class University {
    String universityName;
    String city;

    University(String universityName, String city) {
        System.out.println("University constructor");
        this.universityName = universityName;
        this.city = city;
    }

    public void showUniversityDetails() {
        System.out.println("University: " + universityName);
        System.out.println("City: " + city);
    }
}