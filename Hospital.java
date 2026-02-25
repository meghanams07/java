class Hospital {

    static void bookAppointment(String patientName, String symptom) {
        System.out.println("Hospital appointment confirmed");

        Nurse.basicCheck(patientName, symptom, 120, false);
    }
}