class ECommerceExecutor {
    public static void main(String[] args) {
        ECommerce ecommerce = new ECommerce();

        ecommerce.addProduct("Laptop");
        ecommerce.addProduct("Smartphone");
        ecommerce.addProduct("Tablet");
        ecommerce.addProduct("Smartwatch");
        ecommerce.addProduct("Headphones");
        ecommerce.addProduct("Bluetooth Speaker");
        ecommerce.addProduct("Camera");
        ecommerce.addProduct("Printer");
        ecommerce.addProduct("Monitor");
        ecommerce.addProduct("Keyboard");
        ecommerce.addProduct("Mouse");
        ecommerce.addProduct("Power Bank");
        ecommerce.addProduct("Charger");
        ecommerce.addProduct("USB Cable");
        ecommerce.addProduct("External Hard Drive");
        ecommerce.addProduct("Pen Drive");
        ecommerce.addProduct("Router");
        ecommerce.addProduct("Modem");
        ecommerce.addProduct("Gaming Console");
        ecommerce.addProduct("TV");
        ecommerce.addProduct("Refrigerator");
        ecommerce.addProduct("Washing Machine");
        ecommerce.addProduct("Air Conditioner");
        ecommerce.addProduct("Microwave Oven");
        ecommerce.addProduct("Electric Kettle");
        ecommerce.addProduct("Induction Stove");

        ecommerce.displayProducts();

        System.out.println("\nGet Product by Index:");
        ecommerce.getString(6);

        System.out.println("\nGet Index by Name:");
        ecommerce.getIndex("Camera");

        System.out.println("\nUpdate Product:");
        ecommerce.updateProduct("Laptop", "Gaming Laptop");
        ecommerce.displayProducts();

        System.out.println("\nDelete Product:");
        ecommerce.deleteProduct("Tablet");
        ecommerce.displayProducts();
    }
}