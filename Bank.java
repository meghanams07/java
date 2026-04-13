class Bank {

    BankAccount account;

    public boolean createAccount(BankAccount account) {

        if (account.getAccountNumber() > 0 && account.getHolderName() != null && !account.getHolderName().isEmpty() &&
            account.getBalance() >= 0) {

            this.account = account;
            return true;
        }

        return false;
    }

    public void getDetails() {
        if (account != null) {
            System.out.println(account.getAccountNumber());
            System.out.println(account.getHolderName());
            System.out.println(account.getBalance());
        }
    }
}