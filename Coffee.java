class Coffee {

    int coffeeId, temperature, price;
    String coffeeName, type, beansType, originCountry, roastLevel, flavor;
    String milkType, sugarLevel, cupSize, brand, currency, preparationMethod;
    String topping, category, status, popularity, description;

    public Coffee(int coffeeId, String coffeeName, String type, String beansType, 
                  String originCountry, String roastLevel, String flavor, String milkType,
                  String sugarLevel, int temperature, String cupSize, String brand,
                  int price, String currency, String preparationMethod, String topping,
                  String category, String status, String popularity, String description) {
        this.coffeeId = coffeeId;
        this.coffeeName = coffeeName;
        this.type = type;
        this.beansType = beansType;
        this.originCountry = originCountry;
        this.roastLevel = roastLevel;
        this.flavor = flavor;
        this.milkType = milkType;
        this.sugarLevel = sugarLevel;
        this.temperature = temperature;
        this.cupSize = cupSize;
        this.brand = brand;
        this.price = price;
        this.currency = currency;
        this.preparationMethod = preparationMethod;
        this.topping = topping;
        this.category = category;
        this.status = status;
        this.popularity = popularity;
        this.description = description;
    }

    public void displayDetails() {
        System.out.println("CoffeeId: " + coffeeId);
        System.out.println("CoffeeName: " + coffeeName);
        System.out.println("Type: " + type);
        System.out.println("BeansType: " + beansType);
        System.out.println("OriginCountry: " + originCountry);
        System.out.println("RoastLevel: " + roastLevel);
        System.out.println("Flavor: " + flavor);
        System.out.println("MilkType: " + milkType);
        System.out.println("SugarLevel: " + sugarLevel);
        System.out.println("Temperature: " + temperature + " C");
        System.out.println("CupSize: " + cupSize);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price + " " + currency);
        System.out.println("PreparationMethod: " + preparationMethod);
        System.out.println("Topping: " + topping);
        System.out.println("Category: " + category);
        System.out.println("Status: " + status);
        System.out.println("Popularity: " + popularity);
        System.out.println("Description: " + description);
        System.out.println("----------------------------------------");
    }
}