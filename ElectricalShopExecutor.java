class ElectricalShopExecutor {
    public static void main(String[] args) {

        ElectricalShop shop = new ElectricalShop();

        shop.addAppliance("Fan");
        shop.addAppliance("Tube Light");
        shop.addAppliance("LED Bulb");
        shop.addAppliance("Mixer Grinder");
        shop.addAppliance("Iron Box");
        shop.addAppliance("Refrigerator");
        shop.addAppliance("Washing Machine");
        shop.addAppliance("Air Conditioner");
        shop.addAppliance("Water Heater");
        shop.addAppliance("Electric Kettle");
        shop.addAppliance("Microwave Oven");
        shop.addAppliance("Induction Stove");
        shop.addAppliance("Toaster");
        shop.addAppliance("Coffee Maker");
        shop.addAppliance("Juicer");
        shop.addAppliance("Vacuum Cleaner");
        shop.addAppliance("Room Heater");
        shop.addAppliance("Hair Dryer");
        shop.addAppliance("Water Purifier");
        shop.addAppliance("Dishwasher");

        shop.getAppliances();

        System.out.println();

        int index = 7;
        String appliance = shop.getApplianceByIndex(index);
        if (appliance != null) {
            System.out.println("The appliance at index " + index + " is " + appliance);
        }

        String applianceName = "Fan";
        int i = shop.getIndexByApplianceName(applianceName);
        System.out.println("The appliance " + applianceName + " is at index " + i);
    }
}