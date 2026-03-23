class Restaurant {
    String name;
    String cuisine;

    Restaurant(String name, String cuisine) {
        System.out.println("Restaurant constructor");
        this.name = name;
        this.cuisine = cuisine;
    }

    public void showRestaurantDetails() {
        System.out.println("Restaurant: " + name);
        System.out.println("Cuisine: " + cuisine);
    }
}