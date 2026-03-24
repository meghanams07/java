class ElectricalShopManager {
    private String[] appliances = new String[20];
    int index = 0;

    public boolean addAppliance(String applianceName) {
        boolean isAdded = false;

        if (applianceName != null && !applianceName.isEmpty()) {
            if (index < appliances.length) {
                appliances[index] = applianceName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Appliance list is full");
            }
        } else {
            System.out.println("Invalid appliance name");
        }

        return isAdded;
    }

    public void getAppliances() {
        for (String appliance : appliances) {
            if (appliance != null) {
                System.out.println(appliance);
            }
        }
    }
}

