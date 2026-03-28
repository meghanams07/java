class ElectricalShopExecutor {
    public static void main(String[] args) {
        ElectricalShop shop = new ElectricalShop();

        shop.addAppliance("Fan");
        shop.addAppliance("Light Bulb");
        shop.addAppliance("Tube Light");
        shop.addAppliance("Mixer Grinder");
        shop.addAppliance("Iron Box");
        shop.addAppliance("Electric Kettle");
        shop.addAppliance("Toaster");
        shop.addAppliance("Induction Stove");
        shop.addAppliance("Microwave Oven");
        shop.addAppliance("Refrigerator");
        shop.addAppliance("Washing Machine");
        shop.addAppliance("Air Conditioner");
        shop.addAppliance("Water Heater");
        shop.addAppliance("Ceiling Fan");
        shop.addAppliance("Table Fan");
        shop.addAppliance("Exhaust Fan");
        shop.addAppliance("Inverter");
        shop.addAppliance("Stabilizer");
        shop.addAppliance("Electric Chimney");
        shop.addAppliance("Dishwasher");

        shop.displayAppliances();

        System.out.println("\nGet Appliance by Index:");
        shop.getString(4);

        System.out.println("\nGet Index by Name:");
        shop.getIndex("Microwave Oven");

        System.out.println("\nUpdate Appliance:");
        shop.updateAppliance("Fan", "Smart Fan");
        shop.displayAppliances();

        System.out.println("\nDelete Appliance:");
        shop.deleteAppliance("Toaster");
        shop.displayAppliances();
    }
}