class Instagram {

    InstagramAccount account;

    public boolean createAccount(InstagramAccount account) {

        boolean isCreated = false;
        boolean isIdValid = false;
        boolean isUsernameValid = false;
        boolean isEmailValid = false;

        if (account.getId() > 0) {
            isIdValid = true;
        }

        if (account.getUsername() != null && !account.getUsername().isEmpty()) {
            isUsernameValid = true;
        }

        if (account.getEmail() != null && !account.getEmail().isEmpty()) {
            isEmailValid = true;
        }

        if (isIdValid && isUsernameValid && isEmailValid) {
            this.account = account;
            isCreated = true;
        }

        return isCreated;
    }

    public void getDetails() {
        if (account != null) {
            System.out.println("Id: " + account.getId());
            System.out.println("Username: " + account.getUsername());
            System.out.println("Email: " + account.getEmail());
        } else {
            System.out.println("No account created");
        }
    }
}