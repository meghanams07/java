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
        gym.addEquipment("Exercise Bike");
        gym.addEquipment("Kettlebell");
        gym.addEquipment("Rowing Machine");
        gym.addEquipment("Cable Machine");
        gym.addEquipment("Smith Machine");
        gym.addEquipment("Ab Roller");
        gym.addEquipment("Resistance Bands");
        gym.addEquipment("Skipping Rope");
        gym.addEquipment("Medicine Ball");

        gym.getEquipments();

        System.out.println();

        int index = 4;
        String equipment = gym.getEquipmentByIndex(index);
        if (equipment != null) {
            System.out.println("The equipment at index " + index + " is " + equipment);
        }

        String equipmentName = "Dumbbells";
        int i = gym.getIndexByEquipmentName(equipmentName);
        System.out.println("The equipment " + equipmentName + " is at index " + i);
    }
}