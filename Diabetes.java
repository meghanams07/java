class Diabetes {

    String patientName;
    int age;
    String gender;
    String diabetesType;
    double bloodSugarLevel;
    double fastingSugarLevel;
    double postMealSugarLevel;
    String symptoms;
    String treatment;
    String medication;
    String doctorName;
    String hospitalName;
    String city;
    String country;
    double weight;
    double height;
    String dietPlan;
    boolean insulinRequired;
    int diagnosisYear;
    boolean underControl;

    Diabetes(String patientName, int age, String gender, String diabetesType,
             double bloodSugarLevel, double fastingSugarLevel, double postMealSugarLevel,
             String symptoms, String treatment, String medication, String doctorName,
             String hospitalName, String city, String country, double weight,
             double height, String dietPlan, boolean insulinRequired,
             int diagnosisYear, boolean underControl) {

        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.diabetesType = diabetesType;
        this.bloodSugarLevel = bloodSugarLevel;
        this.fastingSugarLevel = fastingSugarLevel;
        this.postMealSugarLevel = postMealSugarLevel;
        this.symptoms = symptoms;
        this.treatment = treatment;
        this.medication = medication;
        this.doctorName = doctorName;
        this.hospitalName = hospitalName;
        this.city = city;
        this.country = country;
        this.weight = weight;
        this.height = height;
        this.dietPlan = dietPlan;
        this.insulinRequired = insulinRequired;
        this.diagnosisYear = diagnosisYear;
        this.underControl = underControl;
    }

    void display() {

        System.out.println("Patient Name : " + this.patientName);
        System.out.println("Age : " + this.age);
        System.out.println("Gender : " + this.gender);
        System.out.println("Diabetes Type : " + this.diabetesType);
        System.out.println("Blood Sugar Level : " + this.bloodSugarLevel);
        System.out.println("Fasting Sugar Level : " + this.fastingSugarLevel);
        System.out.println("Post Meal Sugar Level : " + this.postMealSugarLevel);
        System.out.println("Symptoms : " + this.symptoms);
        System.out.println("Treatment : " + this.treatment);
        System.out.println("Medication : " + this.medication);
        System.out.println("Doctor Name : " + this.doctorName);
        System.out.println("Hospital Name : " + this.hospitalName);
        System.out.println("City : " + this.city);
        System.out.println("Country : " + this.country);
        System.out.println("Weight : " + this.weight);
        System.out.println("Height : " + this.height);
        System.out.println("Diet Plan : " + this.dietPlan);
        System.out.println("Insulin Required : " + this.insulinRequired);
        System.out.println("Diagnosis Year : " + this.diagnosisYear);
        System.out.println("Under Control : " + this.underControl);
        System.out.println("-----------------------------------");
    }
}