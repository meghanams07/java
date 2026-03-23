class OnlineProduct extends Product {
    OnlineProduct(String productName, double price) {
        super(productName, price);
        System.out.println("OnlineProduct constructor");
    }
}