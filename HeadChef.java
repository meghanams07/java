class HeadChef {

    public static void cook(String dishName) {
        System.out.println("Cooking started");
        RecipeBook.getSteps(dishName);
        System.out.println(dishName + " prepared");
        System.out.println("Cooking ended");
    }
}