class Insurance {
    String policyNumber;
    double premium;

    Insurance(String policyNumber, double premium) {
        System.out.println("Insurance constructor");
        this.policyNumber = policyNumber;
        this.premium = premium;
    }

    public void showInsuranceDetails() {
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Premium: " + premium);
    }
}
