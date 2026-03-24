class ElectricalShopExecutor {
    public static void main(String[] args) {

        ElectricalShopManager manager = new ElectricalShopManager();

        manager.addAppliance("Fan");
        manager.addAppliance("Tube Light");
        manager.addAppliance("LED Bulb");
        manager.addAppliance("Refrigerator");
        manager.addAppliance("Washing Machine");
        manager.addAppliance("Air Conditioner");
        manager.addAppliance("Heater");
        manager.addAppliance("Geyser");
        manager.addAppliance("Mixer Grinder");
        manager.addAppliance("Iron Box");
        manager.addAppliance("Microwave Oven");
        manager.addAppliance("Induction Stove");
        manager.addAppliance("Electric Kettle");
        manager.addAppliance("Toaster");
        manager.addAppliance("Water Purifier");
        manager.addAppliance("Ceiling Fan");
        manager.addAppliance("Table Fan");
        manager.addAppliance("Exhaust Fan");
        manager.addAppliance("Inverter");
        manager.addAppliance("Battery");

        manager.getAppliances();
    }
}