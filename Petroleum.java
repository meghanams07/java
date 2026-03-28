class Petroleum {
    private String petroleumProducts[] = new String[10];
    int index;

    public boolean addProduct(String product){
        boolean isValid = false;
        if(product != null && !product.isEmpty()){
            if(index < petroleumProducts.length){
                petroleumProducts[index] = product;
                index++;
                isValid = true;
            } else {
                System.out.println("Product list is full");
            }
        } else {
            System.out.println(product + " Not Valid");
        }
        return isValid;
    }

    public void displayProducts(){
        System.out.println("\n--- Petroleum Products ---");
        for(String product : petroleumProducts){
            if(product != null){
                System.out.println(product);
            }
        }
    }

    public String getString(int index){
        String product = null;
        if(index < petroleumProducts.length){
            product = petroleumProducts[index];
            System.out.println(product);
            index++;
        } else System.out.println("Invalid");
        return product;
    }

    public int getIndex(String product){
        int index = 0;
        for(String p : petroleumProducts){
            if(p == product){
                System.out.println(index);
                return index;
            }
            index++;
        }
        System.out.println("Invalid");
        return 0;
    }

    public boolean updateProduct(String existingProduct, String updatedProduct){
        boolean isUpdated = false;
        for(int index = 0; index < petroleumProducts.length; index++){
            if(petroleumProducts[index] == existingProduct){
                petroleumProducts[index] = updatedProduct;
                isUpdated = true;
            }
        }
        if(isUpdated == false){
            System.out.println("Product Not Found");
        }
        return isUpdated;
    }

    public boolean deleteProduct(String product){
        boolean isFound = false;
        int i = 0;
        for(int index = 0; index < petroleumProducts.length; index++){
            if(petroleumProducts[index].equals(product)){
                i = index;
                System.out.println(i);
                isFound = true;
                break;
            }
        }
        if(isFound == true){
            for(int j = i; j < petroleumProducts.length - 1; j++){
                petroleumProducts[j] = petroleumProducts[j + 1];
            }
            petroleumProducts[petroleumProducts.length - 1] = null;
        }
        return isFound;
    }
}