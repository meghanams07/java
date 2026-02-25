class Reception {

    static void book(String patientName, String symptom, String email, long mobile) {
        System.out.println("Reception booked appointment");

        Hospital.bookAppointment(patientName, symptom);
    }
}