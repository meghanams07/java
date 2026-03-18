class TediBarLotionExecutor {
    public static void main(String[] args) {

        TediBarLotion t1 = new TediBarLotion();
        t1.displayDetails();

        TediBarLotion t2 = new TediBarLotion(2, "TediBar Plus", 150.0);
        t2.displayDetails();

        TediBarLotion t3 = new TediBarLotion(3, "TediBar Advanced", "Rose", 200.0, 3,
                "Pink", "Moisturizer", "Dry", "Curatio", "India",
                250.0, "01-2027", "02-2024", true, 5,
                "Pump", "Large", "Night Use", "Vitamin E", true);
        t3.displayDetails();
    }
}