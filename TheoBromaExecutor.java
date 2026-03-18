class TheoBromaExecutor {
    public static void main(String[] args) {

        TheoBroma t1 = new TheoBroma();
        t1.displayDetails();

        System.out.println("----------");

        TheoBroma t2 = new TheoBroma(2, "TheoBroma Deluxe", "Chennai", "Rahul", 9123456780L);
        t2.displayDetails();
    }
}