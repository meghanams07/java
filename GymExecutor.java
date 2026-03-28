class GymExecutor {
    public static void main(String[] args) {
        Gym gym = new Gym();

        gym.addEquipment("Treadmill");
        gym.addEquipment("Dumbbells");
        gym.addEquipment("Barbell");
        gym.addEquipment("Bench Press");
        gym.addEquipment("Pull-up Bar");
        gym.addEquipment("Leg Press");
        gym.addEquipment("Elliptical");
        gym.addEquipment("Stationary Bike");
        gym.addEquipment("Kettlebell");
        gym.addEquipment("Cable Machine");
        gym.addEquipment("Smith Machine");
        gym.addEquipment("Rowing Machine");
        gym.addEquipment("Stepper");
        gym.addEquipment("Chest Press Machine");
        gym.addEquipment("Lat Pulldown Machine");
        gym.addEquipment("Ab Crunch Machine");

        gym.displayEquipment();

        System.out.println("\nGet Equipment by Index:");
        gym.getString(3);

        System.out.println("\nGet Index by Name:");
        gym.getIndex("Kettlebell");

        System.out.println("\nUpdate Equipment:");
        gym.updateEquipment("Dumbbells", "Adjustable Dumbbells");
        gym.displayEquipment();

        System.out.println("\nDelete Equipment:");
        gym.deleteEquipment("Stepper");
        gym.displayEquipment();
    }
}