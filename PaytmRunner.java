class PaytmRunner {
    public static void main(String[] args) {
        Paytm p = new Paytm();

        PaytmAccount a = new PaytmAccount();
        a.setId(3);
        a.setName("Meghana");
        a.setBalance(1000);

        System.out.println(p.createAccount(a));
        p.getDetails();
    }
}