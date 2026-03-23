class HealthInsurance extends Insurance {
    HealthInsurance(String policyNumber, double premium) {
        super(policyNumber, premium);
        System.out.println("HealthInsurance constructor");
    }
}