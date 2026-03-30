class NutritionTable {

    private int nutritionId;
    private String foodName;
    private double calories;
    private double protein;
    private double carbs;
    private double fats;
    private String servingSize;

    public void setNutritionId(int nutritionId){
        this.nutritionId = nutritionId;
    }

    public int getNutritionId(){
        return this.nutritionId;
    }

    public void setFoodName(String foodName){
        this.foodName = foodName;
    }

    public String getFoodName(){
        return this.foodName;
    }

    public void setCalories(double calories){
        this.calories = calories;
    }

    public double getCalories(){
        return this.calories;
    }

    public void setProtein(double protein){
        this.protein = protein;
    }

    public double getProtein(){
        return this.protein;
    }

    public void setCarbs(double carbs){
        this.carbs = carbs;
    }

    public double getCarbs(){
        return this.carbs;
    }

    public void setFats(double fats){
        this.fats = fats;
    }

    public double getFats(){
        return this.fats;
    }

    public void setServingSize(String servingSize){
        this.servingSize = servingSize;
    }

    public String getServingSize(){
        return this.servingSize;
    }
}