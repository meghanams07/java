class Nurse {

    static void basicCheck(String patientName, String symptom, int bp, boolean sugar) {
        System.out.println("Nurse checking BP and Sugar");

        Doctor.treat(patientName, symptom);
    }
}