class FlipkartRunner {
    public static void main(String[] args) {
        Flipkart f = new Flipkart();

        FlipkartAccount a = new FlipkartAccount();
        a.setId(55);
        a.setName("Nilav");
        a.setAddress("Bangalore");

        System.out.println(f.createAccount(a));
        f.getDetails();
    }
}