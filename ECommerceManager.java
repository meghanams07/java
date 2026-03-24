class ECommerceManager {
    private String[] productNames = new String[26];
    int index = 0;

    public boolean addProduct(String productName) {
        boolean isAdded = false;

        if (productName != null && !productName.isEmpty()) {
            if (index < productNames.length) {
                productNames[index] = productName;
                index++;
                isAdded = true;
            } else {
                System.out.println("Product list is full");
            }
        } else {
            System.out.println("Invalid product name");
        }

        return isAdded;
    }

    public void getProducts() {
        for (String product : productNames) {
            if (product != null) {
                System.out.println(product);
            }
        }
    }
}

