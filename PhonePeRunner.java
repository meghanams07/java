class PhonePeRunner {
    public static void main(String[] args) {
        PhonePe p = new PhonePe();

        PhonePeAccount a = new PhonePeAccount();
        a.setId(4);
        a.setName("Nilav");
        a.setPhone(9876543210L);

        System.out.println(p.createAccount(a));
        p.getDetails();
    }
}