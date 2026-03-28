class PetShop {
    private String petAccessories[] = new String[20];
    int index;

    public boolean addAccessory(String accessory) {
        boolean isAdded = false;

        if (accessory != null && !accessory.isEmpty()) {
            if (index < petAccessories.length) {
                petAccessories[index++] = accessory;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(accessory + " is invalid accessory");
        }
        return isAdded;
    }

    public void getAccessories() {
        for (String acc : petAccessories) {
            if (acc != null) {
                System.out.println(acc);
            }
        }
    }

    public String getAccessoryByIndex(int index) {
        if (index < petAccessories.length && petAccessories[index] != null) {
            return petAccessories[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexByAccessoryName(String accessoryName) {
        for (int i = 0; i < petAccessories.length; i++) {
            if (petAccessories[i] != null && petAccessories[i].equals(accessoryName)) {
                return i;
            }
        }
        System.out.println("invalid accessory " + accessoryName);
        return -1;
    }
}