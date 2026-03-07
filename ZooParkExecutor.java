class ZooParkExecutor{
    public static void main(String[] args){

        ZooPark park = new ZooPark();
        park.parkName = "Green Valley Zoo";
        park.directorName = "Ramesh";
        park.location = "Mysore";
        park.totalAnimals = 120;
        park.entryFee = 100;

        System.out.println("Park name is :"+park.parkName);
        System.out.println("Director name is :"+park.directorName);
        System.out.println("Location is :"+park.location);
        System.out.println("Total animals :"+park.totalAnimals);
        System.out.println("Entry fee :"+park.entryFee);

        String animalNames[] = {"Lion","Tiger","Elephant","Giraffe"};
        System.out.println("Animal names are :");
        for(String animalName : animalNames){
            System.out.println(animalName);
        }

        String animalTypes[] = {"Carnivore","Carnivore","Herbivore","Herbivore"};
        System.out.println("Animal types are :");
        for(String animalType : animalTypes){
            System.out.println(animalType);
        }

        int cageNumbers[] = {1,2,3,4};
        System.out.println("Cage numbers are :");
        for(int cageNumber : cageNumbers){
            System.out.println(cageNumber);
        }

        String foodItems[] = {"Meat","Chicken","Grass","Leaves"};
        System.out.println("Food items are :");
        for(String foodItem : foodItems){
            System.out.println(foodItem);
        }

        double foodCosts[] = {500.50,450.75,200.25,150.00};
        System.out.println("Food costs are :");
        for(double foodCost : foodCosts){
            System.out.println(foodCost);
        }
    }
}