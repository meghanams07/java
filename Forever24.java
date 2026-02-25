class Forever24{

    static String productName;
    static String brand;
    static String category;
    static double price;
    static String size;
    static String color;
    static String material;
    static int stockQuantity;
    static double rating;
    static boolean isReturnable;
    static int warrantyDays;
    static String genderType;

    public static boolean createProduct(String productNames,String brands,String categories, double prices,String sizes,String colors,String materials,
            int stock,double ratings,boolean returnable,int warranty,String gender){

        boolean isProductCreated = false;
        boolean isproductNameValid = false;
        boolean isbrandValid = false;
        boolean iscategoryValid = false;
        boolean ispriceValid = false;
        boolean issizeValid = false;
        boolean iscolorValid = false;
        boolean ismaterialValid = false;
        boolean isstockValid = false;
        boolean isratingValid = false;
        boolean isreturnableValid = false;
        boolean iswarrantyValid = false;
        boolean isgenderValid = false;

        if(productNames != null && productNames.length() >= 3){
            productName = productNames;
            isproductNameValid = true;
        }else{
            System.out.println("Product name is not valid");
        }

        if(brands != null && brands.length() >= 2){
            brand = brands;
            isbrandValid = true;
        }else{
            System.out.println("Brand is not valid");
        }

        if(categories != null && categories.length() >= 3){
            category = categories;
            iscategoryValid = true;
        }else{
            System.out.println("Category is not valid");
        }

        if(prices > 100 && prices < 100000){
            price = prices;
            ispriceValid = true;
        }else{
            System.out.println("Price is not valid");
        }

        if(sizes != null && sizes.length() >= 1){
            size = sizes;
            issizeValid = true;
        }else{
            System.out.println("Size is not valid");
        }

        if(colors != null && colors.length() >= 3){
            color = colors;
            iscolorValid = true;
        }else{
            System.out.println("Color is not valid");
        }

        if(materials != null && materials.length() >= 3){
            material = materials;
            ismaterialValid = true;
        }else{
            System.out.println("Material is not valid");
        }

        if(stock >= 0 && stock <= 10000){
            stockQuantity = stock;
            isstockValid = true;
        }else{
            System.out.println("Stock quantity is not valid");
        }

        if(ratings >= 1.0 && ratings <= 5.0){
            rating = ratings;
            isratingValid = true;
        }else{
            System.out.println("Rating is not valid");
        }

        if(returnable == true || returnable == false){
            isReturnable = returnable;
            isreturnableValid = true;
        }

        if(warranty >= 0 && warranty <= 365){
            warrantyDays = warranty;
            iswarrantyValid = true;
        }else{
            System.out.println("Warranty days is not valid");
        }

        if(gender != null && gender.length() >= 3){
            genderType = gender;
            isgenderValid = true;
        }else{
            System.out.println("Gender type is not valid");
        }

        if(isproductNameValid && isbrandValid && iscategoryValid && ispriceValid && issizeValid && iscolorValid &&
           ismaterialValid && isstockValid && isratingValid &&isreturnableValid && iswarrantyValid && isgenderValid){

            isProductCreated = true;
        }

        return isProductCreated;
    };

    public static void getProductDetails(){

        System.out.println("Forever24 Product Details are :");
        System.out.println("Product Name : " + productName);
        System.out.println("Brand : " + brand);
        System.out.println("Category : " + category);
        System.out.println("Price : " + price);
        System.out.println("Size : " + size);
        System.out.println("Color : " + color);
        System.out.println("Material : " + material);
        System.out.println("Stock Quantity : " + stockQuantity);
        System.out.println("Rating : " + rating);
        System.out.println("Returnable : " + isReturnable);
        System.out.println("Warranty Days : " + warrantyDays);
        System.out.println("Gender Type : " + genderType);
    };
}