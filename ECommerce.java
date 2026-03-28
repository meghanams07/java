class ECommerce {
    private String productNames[] = new String[26];
    int index;

    public boolean addProduct(String product) {
        boolean isAdded = false;

        if (product != null && !product.isEmpty()) {
            if (index < productNames.length) {
                productNames[index++] = product;
                isAdded = true;
            } else {
                System.out.println("array is full");
            }
        } else {
            System.out.println(product + " is invalid product");
        }
        return isAdded;
    }

    public void getProducts() {
        for (String prod : productNames) {
            if (prod != null) {
                System.out.println(prod);
            }
        }
    }

    public String getProductByIndex(int index) {
        if (index < productNames.length && productNames[index] != null) {
            return productNames[index];
        } else {
            System.out.println("invalid index " + index);
            return null;
        }
    }

    public int getIndexByProductName(String productName) {
        for (int i = 0; i < productNames.length; i++) {
            if (productNames[i] != null && productNames[i].equals(productName)) {
                return i;
            }
        }
        System.out.println("invalid product " + productName);
        return -1;
    }
}