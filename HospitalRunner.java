class HospitalRunner {
    public static void main(String[] args) {

        Hospital h = new Hospital();

        Patient p = new Patient();
        p.setPatientId(1);
        p.setName("Arun");
        p.setDisease("Fever");

        System.out.println(h.admitPatient(p));
        h.getDetails();
    }
}