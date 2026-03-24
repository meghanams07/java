class PetShopManager {
    private String[] petAccessories = new String[20];
    int index = 0;

    public boolean addAccessory(String accessoryName) {
        boolean isAdded = false;

        if (accessoryName != null && !accessoryName.isEmpty()) {
            if (index < petAccessories.length) {
                petAccessories[index] = accessoryName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Accessory list is full");
            }
        } else {
            System.out.println("Invalid accessory name");
        }

        return isAdded;
    }

    public void getAccessories() {
        for (String accessory : petAccessories) {
            if (accessory != null) {
                System.out.println(accessory);
            }
        }
    }
}

