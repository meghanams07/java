class Hospital {

    Patient patient;

    public boolean admitPatient(Patient patient) {

        if (patient.getPatientId() > 0 && patient.getName() != null && !patient.getName().isEmpty() &&
            patient.getDisease() != null && !patient.getDisease().isEmpty()) {

            this.patient = patient;
            return true;
        }

        return false;
    }

    public void getDetails() {
        if (patient != null) {
            System.out.println(patient.getPatientId());
            System.out.println(patient.getName());
            System.out.println(patient.getDisease());
        }
    }
}