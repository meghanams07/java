class LionDatesExecutor {
    public static void main(String[] args) {

        LionDates l1 = new LionDates();
        l1.displayDetails();

        LionDates l2 = new LionDates(2, "Simba");
        l2.displayDetails();

        LionDates l3 = new LionDates(3, "Rocky", "Zoo", 7, 210.0);
        l3.displayDetails();
    }
}