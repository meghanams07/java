class Ecommerce {
    public static void main(String[] args) {
        String name = "ShopEasy";
        String founder = "Ravi Kumar";
        String headquarters = "Bangalore";

        String categories[] = {"Mobiles", "Clothes", "Electronics", "Home Appliances"};
        String deliveryPartners[] = {"BlueDart", "DelHivery", "Ekart"};

        System.out.println("The Ecommerce Information is:");
        System.out.println("Platform Name: " + name);
        System.out.println("Founder: " + founder);
        System.out.println("Headquarters: " + headquarters);

        for(String category : categories) {
            System.out.println("Product Category: " + category);
        }

        for(String partner : deliveryPartners) {
            System.out.println("Delivery Partner: " + partner);
        }
    }
}
