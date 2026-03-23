class Account {
    String accountNumber;
    String holderName;

    Account(String accountNumber, String holderName) {
        System.out.println("Account constructor");
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public void showAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
    }
}