class TurbineExecutor {
    public static void main(String[] args) {
        Turbine turbine = new Turbine();

        turbine.addTurbine("Steam Turbine");
        turbine.addTurbine("Gas Turbine");
        turbine.addTurbine("Hydraulic Turbine");
        turbine.addTurbine("Wind Turbine");
        turbine.addTurbine("Kaplan Turbine");
        turbine.addTurbine("Pelton Wheel Turbine");
        turbine.addTurbine("Francis Turbine");
        turbine.addTurbine("Impulse Turbine");
        turbine.addTurbine("Reaction Turbine");
        turbine.addTurbine("Micro Turbine");

        turbine.displayTurbines();

        System.out.println("\nGet Turbine by Index:");
        turbine.getString(2);

        System.out.println("\nGet Index by Name:");
        turbine.getIndex("Wind Turbine");

        System.out.println("\nUpdate Turbine:");
        turbine.updateTurbine("Gas Turbine", "Advanced Gas Turbine");
        turbine.displayTurbines();

        System.out.println("\nDelete Turbine:");
        turbine.deleteTurbine("Impulse Turbine");
        turbine.displayTurbines();
    }
}