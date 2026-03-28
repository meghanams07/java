class Gym {
    private String equipments[] = new String[16];
    int index;

    public boolean addEquipment(String equipment) {
        boolean isAdded = false;

        if (equipment != null && !equipment.isEmpty()) {
            if (index < equipments.length) {
                equipments[index++] = equipment;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(equipment + " is invalid equipment");
        }
        return isAdded;
    }

    public void getEquipments() {
        for (String eq : equipments) {
            if (eq != null) {
                System.out.println(eq);
            }
        }
    }

    public String getEquipmentByIndex(int index) {
        if (index < equipments.length && equipments[index] != null) {
            return equipments[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexByEquipmentName(String equipmentName) {
        for (int i = 0; i < equipments.length; i++) {
            if (equipments[i] != null && equipments[i].equals(equipmentName)) {
                return i;
            }
        }
        System.out.println("invalid equipment " + equipmentName);
        return -1;
    }
}