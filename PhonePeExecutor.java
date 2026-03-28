class PhonePeExecutor {
    public static void main(String[] args) {
        PhonePe phonepe = new PhonePe();

        phonepe.addInsurance("Health Insurance");
        phonepe.addInsurance("Life Insurance");
        phonepe.addInsurance("Bike Insurance");
        phonepe.addInsurance("Car Insurance");
        phonepe.addInsurance("Travel Insurance");
        phonepe.addInsurance("Home Insurance");
        phonepe.addInsurance("Term Insurance");
        phonepe.addInsurance("Accident Insurance");
        phonepe.addInsurance("Family Health Insurance");
        phonepe.addInsurance("Senior Citizen Insurance");
        phonepe.addInsurance("Child Insurance Plan");
        phonepe.addInsurance("ULIP Plan");
        phonepe.addInsurance("Critical Illness Insurance");
        phonepe.addInsurance("Group Insurance");
        phonepe.addInsurance("Crop Insurance");
        phonepe.addInsurance("Fire Insurance");
        phonepe.addInsurance("Marine Insurance");
        phonepe.addInsurance("Business Insurance");
        phonepe.addInsurance("Vehicle Insurance");
        phonepe.addInsurance("Medical Insurance");
        phonepe.addInsurance("Dental Insurance");
        phonepe.addInsurance("Vision Insurance");
        phonepe.addInsurance("Pet Insurance");
        phonepe.addInsurance("Wedding Insurance");
        phonepe.addInsurance("Gadget Insurance");
        phonepe.addInsurance("Loan Protection Insurance");
        phonepe.addInsurance("Income Protection Insurance");

        phonepe.displayInsurance();

        System.out.println("\nGet Insurance by Index:");
        phonepe.getString(5);

        System.out.println("\nGet Index by Name:");
        phonepe.getIndex("Pet Insurance");

        System.out.println("\nUpdate Insurance:");
        phonepe.updateInsurance("Bike Insurance", "Two Wheeler Insurance");
        phonepe.displayInsurance();

        System.out.println("\nDelete Insurance:");
        phonepe.deleteInsurance("Car Insurance");
        phonepe.displayInsurance();
    }
}