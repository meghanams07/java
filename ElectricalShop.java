class ElectricalShop {
    private String appliances[] = new String[20];
    int index;

    public boolean addAppliance(String appliance) {
        boolean isAdded = false;

        if (appliance != null && !appliance.isEmpty()) {
            if (index < appliances.length) {
                appliances[index++] = appliance;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(appliance + " is invalid appliance");
        }
        return isAdded;
    }

    public void getAppliances() {
        for (String app : appliances) {
            if (app != null) {
                System.out.println(app);
            }
        }
    }

    public String getApplianceByIndex(int index) {
        if (index < appliances.length && appliances[index] != null) {
            return appliances[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexByApplianceName(String applianceName) {
        for (int i = 0; i < appliances.length; i++) {
            if (appliances[i] != null && appliances[i].equals(applianceName)) {
                return i;
            }
        }
        System.out.println("invalid appliance " + applianceName);
        return -1;
    }
}