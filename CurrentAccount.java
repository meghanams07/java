class CurrentAccount extends Account {
    CurrentAccount(String accountNumber, String holderName) {
        super(accountNumber, holderName);
        System.out.println("CurrentAccount constructor");
    }
}