class PhonePeExecutor {
    public static void main(String[] args) {

        PhonePe phonePe = new PhonePe();

        phonePe.addInsurance("Health Insurance");
        phonePe.addInsurance("Life Insurance");
        phonePe.addInsurance("Bike Insurance");
        phonePe.addInsurance("Car Insurance");
        phonePe.addInsurance("Travel Insurance");
        phonePe.addInsurance("Accident Insurance");
        phonePe.addInsurance("Term Insurance");
        phonePe.addInsurance("Family Health Plan");
        phonePe.addInsurance("Senior Citizen Plan");
        phonePe.addInsurance("Child Plan");
        phonePe.addInsurance("Critical Illness");
        phonePe.addInsurance("Dental Insurance");
        phonePe.addInsurance("Vision Insurance");
        phonePe.addInsurance("Home Insurance");
        phonePe.addInsurance("Fire Insurance");
        phonePe.addInsurance("Crop Insurance");
        phonePe.addInsurance("Pet Insurance");
        phonePe.addInsurance("Student Insurance");
        phonePe.addInsurance("Loan Protection");
        phonePe.addInsurance("Income Protection");
        phonePe.addInsurance("Group Insurance");
        phonePe.addInsurance("Medical Top-up");
        phonePe.addInsurance("Cancer Plan");
        phonePe.addInsurance("Diabetes Cover");
        phonePe.addInsurance("COVID Cover");
        phonePe.addInsurance("Maternity Plan");
        phonePe.addInsurance("Hospital Cash Plan");

        phonePe.getInsuranceNames();

        System.out.println();

        int index = 5;
        String insurance = phonePe.getInsuranceByIndex(index);
        if (insurance != null) {
            System.out.println("The insurance at index " + index + " is " + insurance);
        }

        String insuranceName = "Car Insurance";
        int i = phonePe.getIndexByInsuranceName(insuranceName);
        System.out.println("The insurance " + insuranceName + " is at index " + i);
    }
}