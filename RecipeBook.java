class RecipeBook {

    public static void getSteps(String dishName) {
        System.out.println("Getting recipe steps");
        IngredientList.checkStock(dishName);
        System.out.println("Recipe steps ready");
    }
}