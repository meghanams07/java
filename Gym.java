class Gym {
    public static void main(String[] args) {
        String name = "PowerFit Gym";
        String trainer = "Arjun";
        String location = "BTM Layout";

        String equipments[] = {"Treadmill", "Dumbbells", "Bench Press", "Cycling Machine"};
        String batches[] = {"Morning Batch", "Evening Batch"};

        System.out.println("The Gym Information is:");
        System.out.println("Gym Name: " + name);
        System.out.println("Trainer: " + trainer);
        System.out.println("Location: " + location);

        for(String equipment : equipments) {
            System.out.println("Equipment Available: " + equipment);
        }

        for(String batch : batches) {
            System.out.println("Batch Time: " + batch);
        }
    }
}
