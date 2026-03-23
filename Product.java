class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        System.out.println("Product constructor");
        this.productName = productName;
        this.price = price;
    }

    public void showProductDetails() {
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
    }
}