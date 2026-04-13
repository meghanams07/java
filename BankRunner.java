class BankRunner {
    public static void main(String[] args) {

        Bank bank = new Bank();

        BankAccount acc = new BankAccount();
        acc.setAccountNumber(12345);
        acc.setHolderName("Nilav");
        acc.setBalance(5000);

        System.out.println(bank.createAccount(acc));
        bank.getDetails();
    }
}